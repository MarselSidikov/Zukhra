package ru.itis;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        OperationService service = new OperationService(5);

        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                Random random = new Random();
                int value = random.nextInt(10);
                System.out.println(Thread.currentThread().getName() + " запрашивает число " + value);
                int result = service.performAndExpensiveOperation(value);
                if (result != -1) {
                    System.out.println(Thread.currentThread().getName() + " число получено - " + result);
                } else {
                    System.out.println(Thread.currentThread().getName() + " Результат не получен");
                }
            }, "Thread-" + i).start();
        }

    }
}
