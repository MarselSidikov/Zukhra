package com.company.task2;

public class ThreadR {
    public void submit(Runnable task) {
        Thread newThread = new Thread(task);
        newThread.start();
    }
}