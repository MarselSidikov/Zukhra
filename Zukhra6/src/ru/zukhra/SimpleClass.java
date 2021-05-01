package ru.zukhra;

import javafx.fxml.FXML;
import ru.zukhra.annotations.RandomValue;

import java.util.StringJoiner;

/**
 * 01.05.2021
 * Zukhra6
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SimpleClass {

    @FXML
    @RandomValue(from = 5, to = 10)
    private int field1;

    @RandomValue
    private int field2;

    @Override
    public String toString() {
        return new StringJoiner(", ", SimpleClass.class.getSimpleName() + "[", "]")
                .add("field1=" + field1)
                .add("field2=" + field2)
                .toString();
    }
}
