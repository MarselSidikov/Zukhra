import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    MyList<String> names = new MyLinkedList<>();
	    names.add("Зухра");
	    names.add("Марсель");
	    names.add("Алия");
	    names.add("Даниил");
	    names.add("Виктор");
	    names.add("Максим");
	    names.add("Айрат");
	    names.add("Ильгам");
	    names.add("Зульфат");
	    names.add("Тимур");
	    names.add("Оля");
		names.add("Игорь");
		names.add("Павел");
		names.add("Валерий");

		names.reverse();

		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(4));
		System.out.println(names.get(5));
		System.out.println(names.get(6));
		System.out.println(names.get(7));
		System.out.println(names.get(8));
		System.out.println(names.get(9));
		System.out.println(names.get(10));
		System.out.println(names.get(11));

	    int i = 0;
    }
}
