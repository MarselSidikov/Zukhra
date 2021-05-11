package com.company.task2;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Старт");
        ThreadR thread = new ThreadR();
        Runner runner = new Runner();
        thread.submit(runner);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new IllegalArgumentException(e);
        }
        if (runner.isFinish) {
            System.out.println("ПОБЕДИЛ!");
        } else {
            System.out.println("ПРОИГРАЛ");
        }
    }
}
