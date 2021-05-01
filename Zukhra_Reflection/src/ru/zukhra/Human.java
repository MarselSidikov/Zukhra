package ru.zukhra;

/**
 * 01.05.2021
 * Zukhra_Reflection
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Human {
    public double height = 0.0;
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void print() {
        System.out.println(name + " " + age + " " + height);
    }
}
