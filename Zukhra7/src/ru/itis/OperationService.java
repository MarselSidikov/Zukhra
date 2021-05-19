package ru.itis;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 15.05.2021
 * Zukhra7
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class OperationService {
    // кэш чисел, ключ - исходное число (например, 7, значение - рассчитанное число - 49)
    private final Map<Integer, Integer> cache;
    // карта мониторов. Каждый поток может обратиться к монитору по ключу (например, если поток хочет получить квадрат числа 7, то он идет в монитор под ключом номер семь)
    // монитор - пустой объект
    private final Map<Integer, Object> monitors;

    // максимальное количество ожидающих потоков
    private int maxWaitingCountThreads;
    // текущее количество ожидающих потоков
    private int currentWaitingCountThreads;

    private final Random random;

    public OperationService() {
        this.random = new Random();
        this.cache = new ConcurrentHashMap<>();
        this.monitors = new HashMap<>();
    }

    // конструктор, который принимает на вход максимальное количество потоков, имеющих возможность получить значение
    public OperationService(int maxWaitingCountThreads) {
        // вызываем конструктор, который стоит выше
        this();
        // фиксируем максимальное количество ожидающих потоков
        this.maxWaitingCountThreads = maxWaitingCountThreads;
    }



    int performAndExpensiveOperation(int value) {
        boolean waiting = false;
        // если результат вычислений (например, 49 для 7) еще не был рассчитан
        if (!cache.containsKey(value)) {
            // текущий поток кладет под ключ 7 значение -1, что означает, что число значение для 7 уже было запрошено потоком
            cache.put(value, -1);
            // кладет новый монитор под число 7
            monitors.put(value, new Object());
            // запрашивает результат
            int result = calculate(value);
            // как только получил результат -> кладем его вместо -1
            cache.put(value, result);
            System.out.println(Thread.currentThread().getName() + " " + "Оповестили");
            synchronized (monitors.get(value)) {
                // оповещаем другие потоки, которые ждали на этом мониторе
                monitors.get(value).notifyAll();
            }
        }
        // если результат был рассчитан, но уже есть поток, который его запросил
        if (cache.containsKey(value) && cache.get(value) == -1) {
            try {
                // уходим в ожидание на мониторе (например, для числа 7)
                synchronized (monitors.get(value)) {
                    // если есть ограничение на количество ожидающих потоков
                    if (maxWaitingCountThreads != 0) {
                        // если количество ожидающих потоков превышено
                        if (currentWaitingCountThreads >= maxWaitingCountThreads) {
                            System.out.println(Thread.currentThread().getName() + " " + "Превышен лимит потоков.");
                            return -1;
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " " + "Ушли в ожидание");
                    // увеличиваем количество ожидающих потоков
                    currentWaitingCountThreads++;
                    System.out.println("Потоки в ожидании " + currentWaitingCountThreads);
                    waiting = true;
                    monitors.get(value).wait();
                }
            } catch (InterruptedException e) {
                throw new IllegalArgumentException(e);
            }
        }
        // если результат уже есть, сразу возвращаем его
        if (cache.containsKey(value)) {
            if (waiting) {
                currentWaitingCountThreads--;
                System.out.println("Потоки в ожидании " + currentWaitingCountThreads);
            }
            System.out.println(Thread.currentThread().getName() + " Возвращен результат");
            return cache.get(value);
        }
        throw new IllegalStateException("Чет все плохо пошло");
    }

    // вычисление квадрата числа, предполагается, что данная функция вызывается с какой-то существенной задержкой
    private int calculate(int value) {
        waitForOperation();
        return value * value;
    }

    // задерживание потока на случайное (5-10) количество секунд
    private void waitForOperation() {
        long time = 5 + random.nextInt(5);
        try {
            System.out.println(Thread.currentThread().getName() + " " + "OperationService: Вычисление займет " + time + " секунд");
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
