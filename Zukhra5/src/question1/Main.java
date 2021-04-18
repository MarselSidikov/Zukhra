package question1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Human marsel = new Human("Марсель", "Сидиков", true);
        Human anotherMarsel = new Human("Марсель", "Сидиков", false);

        Map<Human, String> map = new HashMap<>();
        map.put(marsel, "Взят на работу");

        System.out.println(map.get(anotherMarsel));
    }
}
