package ru.zukhra;

import ru.zukhra.annotations.RandomValue;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Random;

/**
 * 01.05.2021
 * Zukhra6
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class RandomNumberGenerator {
    public void process(Object object) {
        Random random = new Random();
        // получили класс входного объекта
        Class aClass = object.getClass();
        // получили все поля класса
        Field fields[] = aClass.getDeclaredFields();
        for (Field field : fields) {
            RandomValue[] randomValuesAnnotations = field.getAnnotationsByType(RandomValue.class);
            for (RandomValue randomValueAnnotation : randomValuesAnnotations) {
                int a = randomValueAnnotation.from();
                int b = randomValueAnnotation.to();
                // преобразовали Annotation в RandomValue
                int randomValue = a + random.nextInt(b - a);
                try {
                    field.setAccessible(true);
                    field.set(object, randomValue);
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }
}
