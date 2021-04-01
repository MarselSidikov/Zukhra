public class Main {

    public static void main(String[] args) {
	    MyList<String> names = new MyArrayList<>();
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

		 names.clear();

		 names.add("Игорь");
		 names.add("Павел");
		 names.add("Валерий");

		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));

	    int i = 0;
    }
}
