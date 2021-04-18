package question2;

import java.util.StringJoiner;

/**
 * 18.04.2021
 * Zukhra5
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Human implements Comparable<Human> {
    private String firstName;
    private String lastName;
    private int age;
    private int height;

    public Human(String firstName, String lastName, int age, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    // 0 - если возраст одинаковый
    // отрицательное число - если тот, кто справа - старше
    // положительное число - если ты старше
    @Override
    public int compareTo(Human o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Human.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("age=" + age)
                .add("height=" + height)
                .toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }
}
