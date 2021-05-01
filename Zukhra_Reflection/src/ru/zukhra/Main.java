package ru.zukhra;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    // рефлексия - Class, Field, Method, Constructor
    public static void main(String[] args) throws Exception {
	    Human human = new Human("Марсель", 27);
	    human.print();
        // получили объект типа Class
	    Class aClass = human.getClass();
	    // получила поля класса human
	    Field fields[] = aClass.getDeclaredFields();
	    for (Field field : fields) {
            System.out.println(field.getModifiers() + " " + field.getType() + " " + field.getName());
        }

	    Method method = aClass.getMethod("print");
        System.out.println(method.getModifiers() + " " + method.getReturnType() + " " + method.getName() + " ");
        Method methods[] = aClass.getDeclaredMethods();

        Constructor<Human> humanConstructor = aClass.getConstructor(String.class, int.class);

        Human zukhra = humanConstructor.newInstance("Зухра", 18);
        method.invoke(zukhra);

    }
}
