package com.company.task1;

public class Main {

    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        ThirdThread thirdThread = new ThirdThread();

        firstThread.start();
        try {
            firstThread.join();
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        secondThread.start();
        try {
            secondThread.join();
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        thirdThread.start();
        try {
            thirdThread.join();
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}