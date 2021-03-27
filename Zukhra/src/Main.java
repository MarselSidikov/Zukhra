public class Main {

    public static void main(String[] args) {
        // создал объект
        // marsel - объектная переменная, которая указывает на объект  в памяти
        // есть объект с состоянием (Марсель, 27), на него указывает переменная marsel
        Human marsel = new Human(27, "Марсель");
        marsel.setAge(28);

        Human daniil = new Human(21, "Даниил");

        Human another = marsel;
    }
}
