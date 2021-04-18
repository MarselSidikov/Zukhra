package question2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 18.04.2021
 * Zukhra5
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Айрат", "Мухутдинов", 22, 185);
        Human h2 = new Human("Зухра", "Шагиахметова", 18, 164);
        Human h3 = new Human("Даниил", "Вдовинов", 21, 179);
        Human h4 = new Human("Максим", "Поздеев", 21, 169);
        Human h5 = new Human("Марсель", "Сидиков", 27, 185);

        List<Human> humans = new ArrayList<>();
        humans.add(h1);
        humans.add(h2);
        humans.add(h3);
        humans.add(h4);
        humans.add(h5);

        HumansByHeightComparator comparator = new HumansByHeightComparator();
//        Collections.sort(humans);
        Collections.sort(humans, comparator);
        System.out.println(humans);

    }
}
