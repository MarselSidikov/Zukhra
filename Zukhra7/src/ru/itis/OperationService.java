package ru.itis;

import java.awt.*;
import java.time.LocalTime;
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
    // 5 -> 25
    private final Map<Integer, Integer> cache;
    private final Map<Integer, Object> monitors;
    private final Random random;

    public OperationService() {
        this.random = new Random();
        this.cache = new ConcurrentHashMap<>();
        this.monitors = new HashMap<>();
    }

    // например, подсчет квартальной премии всех сотрудников исходя из отработанных ими дней
    int performAndExpensiveOperation(int value) {
        // ситуация когда ключа в принципе еще в мапе нет
        if (!cache.containsKey(value)) {
            // ты сказала, что ты уже запросила
            cache.put(value, -1);
            monitors.put(value, new Object());
            // запрашиваешь результат
            int result = calculate(value);
            // как только получили результат
            cache.put(value, result);
            System.out.println(Thread.currentThread().getName() + " " + "Оповестили");
            synchronized (monitors.get(value)) {
                monitors.get(value).notifyAll();
            }
        }

        if (cache.containsKey(value) && cache.get(value) == -1) {
            try {
                System.out.println(Thread.currentThread().getName() + " " + "Ушли в ожидание");
                synchronized (monitors.get(value)) {
                    monitors.get(value).wait();
                }
            } catch (InterruptedException e) {
                throw new IllegalArgumentException(e);
            }
        }

        if (cache.containsKey(value)) {
            System.out.println(Thread.currentThread().getName() + " Возвращен результат");
            return cache.get(value);
        }
        throw new IllegalStateException("Чет все плохо пошло");
    }

    private int calculate(int value) {
        waitForOperation();
        return value * value;
    }

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
