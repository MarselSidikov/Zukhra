package ru.zukhra.unit;

import ru.zukhra.annotations.RandomValue;
import ru.zukhra.annotations.SetValue;

import java.util.StringJoiner;

/**
 * 09.05.2021
 * Zukhra6
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class BUnit extends Unit {

    @SetValue(method = "generateRandomType")
    private String unitType;

    @SetValue(method = "setLength")
    private int length;

    public void setLength() {
        length = 5;
    }

    public void generateRandomType() {
        this.unitType = "BUnit";
    }

    @RandomValue(from = 40, to = 50)
    private int someField;

    @RandomValue(from = 50, to = 60)
    private int anotherField;

    @RandomValue(from = 70, to = 80)
    private int thisField;

    @RandomValue(from = 80, to = 90)
    private int thatField;

    @Override
    public String toString() {
        return new StringJoiner(", ", BUnit.class.getSimpleName() + "[", "]")
                .add("unitType='" + unitType + "'")
                .add("length=" + length)
                .add("someField=" + someField)
                .add("anotherField=" + anotherField)
                .add("thisField=" + thisField)
                .add("thatField=" + thatField)
                .toString();
    }
}
