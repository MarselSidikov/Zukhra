/**
 * 27.03.2021
 * Zukhra
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Human {
    // поле, у каждого объекта значение этого поля - свое
    // конкретное значение поля определяет состояние объекта
    private int age;
    String name;

    // не метод, инициализирующая объект конструкция
    Human(int age, String name) {
        this.setAge(age);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
}
