package ru.zukhra.processors;

import ru.zukhra.annotations.RandomValue;
import ru.zukhra.annotations.SetValue;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Set;

/**
 * 09.05.2021
 * Zukhra6
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SetValueProcessor implements AnnotationsProcessor {
    public void process(Object object) {
        Random random = new Random();
        // получили класс входного объекта
        Class aClass = object.getClass();
        // получили все поля класса
        Field fields[] = aClass.getDeclaredFields();
        for (Field field : fields) {
            SetValue[] setValues = field.getAnnotationsByType(SetValue.class);
            for (SetValue setValue : setValues) {
                String methodName = setValue.method();
                try {
                    Method method = aClass.getDeclaredMethod(methodName);
                    method.invoke(object);
                } catch (Exception e) {
                    throw new IllegalArgumentException(e);
                }
            }
        }
    }
}
