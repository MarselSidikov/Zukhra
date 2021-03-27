import java.util.List;
import java.util.Random;

/**
 * 27.03.2021
 * Zukhra
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main2 {
    public static void main(String[] args) {

        HumansGenerator generator = new HumansGenerator();
        HumansStatistic statistic = new HumansStatistic();

        Human humans[] = generator.generate(100, 50);

        humans[34].setAge(-10);

        for (int i = 0; i < humans.length; i++) {
            System.out.printf("Имя - %22s, Возраст - %10d\n", humans[i].name, humans[i].getAge());
        }

        int agesCount[] = statistic.getAgesStatistic(50, humans);

        for (int i = 0; i < agesCount.length; i++) {
            if (agesCount[i] != 0) {
                System.out.printf("Возраст - %10d, Сколько раз - %10d\n", i, agesCount[i]);
            }
        }
    }
}