package ru.zukhra.unit;

import ru.zukhra.annotations.RandomValue;
import ru.zukhra.annotations.SetValue;

import java.util.Arrays;
import java.util.Random;
import java.util.StringJoiner;

/**
 * 09.05.2021
 * Zukhra6
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class AUnit extends Unit {
    @RandomValue(from = 30, to = 40)
    private int someField;

    @RandomValue(from = 10, to = 20)
    private int anotherField;

    @SetValue(method = "generateArray")
    private int array[];

    public void generateArray() {
        this.array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            this.array[i] = random.nextInt();
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AUnit.class.getSimpleName() + "[", "]")
                .add("someField=" + someField)
                .add("anotherField=" + anotherField)
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
