package question3;

/**
 * 18.04.2021
 * Zukhra5
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        // анонимный класс - без имени, и доступен только в фигурных скобках, где мы его создали
        NumbersUtil numbersUtil = new NumbersUtil() {
            @Override
            public int processNumber(int number) {
                // пусть заменит исходное число на сумму его цифр
                int sum = 0;
                while (number != 0) {
                    sum = sum + number % 10;
                    number = number / 10;
                }
                return sum;
            }
        };

        NumbersUtil numbersUtil1 = new NumbersUtil() {
            @Override
            public int processNumber(int number) {
                int mult = 1;
                while (number != 0) {
                    mult = mult * (number % 10);
                    number = number / 10;
                }
                return mult;
            }
        };

        numbersUtil.process(777);
        numbersUtil.process(123);
        numbersUtil.process(555);
        numbersUtil.showProcessedNumbers();

        numbersUtil1.process(777);
        numbersUtil1.process(123);
        numbersUtil1.process(555);
        numbersUtil1.showProcessedNumbers();
    }
}
