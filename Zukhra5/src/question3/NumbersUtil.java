package question3;

/**
 * 18.04.2021
 * Zukhra5
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public abstract class NumbersUtil {
    private static final int MAX_PROCESSED_NUMBERS_COUNT = 10;

    private int processedNumbers[];
    private int processedNumbersCount;

    public NumbersUtil() {
        this.processedNumbers = new int[MAX_PROCESSED_NUMBERS_COUNT];
    }

    public void process(int number) {
        // как-то обрабатываем число
        int processedNumber = processNumber(number);
        // сохраняем число
        saveNumber(processedNumber);
    }

    private void saveNumber(int number) {
        processedNumbers[processedNumbersCount] = number;
        processedNumbersCount++;
    }

    public void showProcessedNumbers() {
        for (int i = 0; i < processedNumbersCount; i++) {
            System.out.println(processedNumbers[i]);
        }
    }

    // метод обработки числа - принимает на вход какое-то число, возвращает измененное число
    public abstract int processNumber(int number);
}
