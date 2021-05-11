package com.company.task1;

/**
 * 11.05.2021
 * Threads
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class RandomUtil {
    public static long randomTime() {
        return (long) (300 + Math.random() * 1300);
    }
}
