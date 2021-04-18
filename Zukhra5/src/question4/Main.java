package question4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 18.04.2021
 * Zukhra5
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
//        NumberProcessFunction digitsSum = new NumberProcessFunction() {
//            @Override
//            public int process(int number) {
//                int sum = 0;
//                while (number != 0) {
//                    sum = sum + number % 10;
//                    number = number / 10;
//                }
//                return sum;
//            }
//        };
//
//        NumberProcessFunction digitsMult = new NumberProcessFunction() {
//            @Override
//            public int process(int number) {
//                int mult = 1;
//                while (number != 0) {
//                    mult = mult * (number % 10);
//                    number = number / 10;
//                }
//                return mult;
//            }
//        };

//        NumberProcessFunction digitsSum = number -> {
//            int sum = 0;
//            while (number != 0) {
//                sum = sum + number % 10;
//                number = number / 10;
//            }
//            return sum;
//        };

        NumberProcessFunction digitsMult = number -> {
            int mult = 1;
            while (number != 0) {
                mult = mult * (number % 10);
                number = number / 10;
            }
            return mult;
        };

        NumbersUtil numbersUtil = new NumbersUtil();
        numbersUtil.process(777, number -> {
            int sum = 0;
            while (number != 0) {
                sum = sum + number % 10;
                number = number / 10;
            }
            return sum;
        });
        numbersUtil.process(555, digitsMult);
        numbersUtil.process(10, 20, (a, b) -> a * b);
        numbersUtil.showProcessedNumbers();
        Function<Integer, Boolean> function = number -> number == 10;
        Predicate<Integer> predicate = number -> number == 10;
        Consumer<String> consumer = text -> System.out.println(text);
        consumer.accept("Привет!");
    }
}
