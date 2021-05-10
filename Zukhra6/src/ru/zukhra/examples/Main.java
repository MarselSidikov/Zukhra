package ru.zukhra.examples;

import ru.zukhra.processors.RandomValueProcessor;

public class Main {

    public static void main(String[] args) {
	    AnotherClass object1 = new AnotherClass();
	    AnotherClass object2 = new AnotherClass();
	    SimpleClass object3 = new SimpleClass();

	    RandomValueProcessor generator = new RandomValueProcessor();
	    generator.process(object1);
        generator.process(object2);
	    generator.process(object3);

		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);


    }
}
