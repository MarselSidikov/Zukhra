package question2;

import java.util.Comparator;

/**
 * 18.04.2021
 * Zukhra5
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class HumansByHeightComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getHeight() - o2.getHeight();
    }
}
