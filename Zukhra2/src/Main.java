import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println((int)'a' + " " + " " + (int)'z');
        int counts[] = new int[25];

        String textString = "aaaaabbbaabbbbbbbbaacccccuuuuu";
        char text[] = textString.toCharArray();

        for (int i = 0; i < text.length; i++) {
            // получила код текущей буквы
            int currentLetter = text[i];
            // преобразовала код буквы в число из диапазона 0 - 24
            // увеличила значение массива под этим индексом
            counts[currentLetter - 'a']++;
        }
        System.out.println(Arrays.toString(text));
        System.out.println(Arrays.toString(counts));

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char)(i + 97) + " - " +  counts[i]);
            }
        }
    }


}
