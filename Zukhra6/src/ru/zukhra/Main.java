package ru.zukhra;

import ru.zukhra.processors.RandomValueProcessor;
import ru.zukhra.processors.SetValueProcessor;
import ru.zukhra.unit.Unit;

import java.util.Arrays;

/**
 * 09.05.2021
 * Zukhra6
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        UnitFactory factory = new UnitFactory(Arrays.asList(new RandomValueProcessor(),
                new SetValueProcessor()));

        Unit b = factory.createUnitByName("ru.zukhra.unit.BUnit");
        Unit a = factory.createUnitByName("ru.zukhra.unit.AUnit");
        System.out.println(b);
        System.out.println(a);
    }
}
