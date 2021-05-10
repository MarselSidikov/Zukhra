package ru.zukhra.unit;

import ru.zukhra.annotations.RandomValue;

/**
 * 09.05.2021
 * Zukhra6
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class CUnit extends Unit {
    @RandomValue(from = 90, to = 100)
    private int someField;
}
