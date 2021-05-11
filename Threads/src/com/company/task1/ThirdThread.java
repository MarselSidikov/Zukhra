package com.company.task1;

public class ThirdThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("ThirdThread");
            try {
                Thread.sleep(RandomUtil.randomTime());
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}