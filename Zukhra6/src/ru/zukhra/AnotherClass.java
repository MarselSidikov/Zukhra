package ru.zukhra;

import ru.zukhra.annotations.RandomValue;

import java.util.StringJoiner;

/**
 * 01.05.2021
 * Zukhra6
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class AnotherClass {
    @RandomValue(from = 99, to = 150)
    private int field1;

    @RandomValue
    private int field2;

    @RandomValue(from = -100, to = 500)
    private int field3;

    @Override
    public String toString() {
        return new StringJoiner(", ", AnotherClass.class.getSimpleName() + "[", "]")
                .add("field1=" + field1)
                .add("field2=" + field2)
                .add("field3=" + field3)
                .toString();
    }
}
