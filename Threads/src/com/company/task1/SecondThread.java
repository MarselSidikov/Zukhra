package com.company.task1;

public class SecondThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("SecondThread");
            try {
                Thread.sleep(RandomUtil.randomTime());
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}