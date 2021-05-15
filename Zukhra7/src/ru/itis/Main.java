package ru.itis;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        OperationService service = new OperationService();

        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                Random random = new Random();
                int value = random.nextInt(10);
                System.out.println(Thread.currentThread().getName() + " запрашивает число " + value);
                int result = service.performAndExpensiveOperation(value);
                System.out.println(Thread.currentThread().getName() + " число получено - " + result);
            }, "Thread-" + i).start();
        }

    }
}
