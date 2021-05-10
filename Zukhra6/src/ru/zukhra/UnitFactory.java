package ru.zukhra;

import ru.zukhra.processors.AnnotationsProcessor;
import ru.zukhra.unit.Unit;

import java.util.List;

/**
 * 09.05.2021
 * Zukhra6
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UnitFactory {

    private List<AnnotationsProcessor> processors;

    public UnitFactory(List<AnnotationsProcessor> processors) {
        this.processors = processors;
    }

    public Unit createUnitByName(String unitClass) throws Exception {
        // загружает классов JVM по его названию и возвращает объект Class
        try {
            Class<?> aClass = Class.forName(unitClass);
            if (aClass.getSuperclass().equals(Unit.class)) {
                // если класс является дочерним, нужно создать его экземпляр
                Object newUnit = aClass.newInstance();
                for (AnnotationsProcessor processor : processors) {
                    processor.process(newUnit);
                }
                return (Unit)newUnit;
            } else {
                throw new IllegalArgumentException("Класс не является дочерним от Unit");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
