package com.company.task2;

import com.company.task1.RandomUtil;

public class Runner implements Runnable {

    public boolean isFinish;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            System.out.println("Точка " + i + " достигнута");
            if (i == 4) {
                isFinish = true;
            }
            try {
                Thread.sleep(RandomUtil.randomTime());
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
