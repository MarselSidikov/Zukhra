package com.company.task1;

public class FirstThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("FirstThread");
            try {
                Thread.sleep(RandomUtil.randomTime());
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}