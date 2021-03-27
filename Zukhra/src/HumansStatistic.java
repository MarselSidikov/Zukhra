/**
 * 27.03.2021
 * Zukhra
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class HumansStatistic {
    int[] getAgesStatistic(int maxAge, Human humans[]) {
        int agesCount[] = new int[50]; // числовой массив на 50 чисел

        for (int i = 0; i < humans.length; i++) {
            // берем возраст i-го человека
            int currentAge = humans[i].getAge();
            // в массиве agesCount значение под этим возрастом (индексом) увеличиваем на 1
            agesCount[currentAge]++;
        }

        return agesCount;
    }

}
