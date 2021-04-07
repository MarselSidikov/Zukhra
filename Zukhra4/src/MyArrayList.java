/**
 * 31.03.2021
 * Zukhra4
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MyArrayList<T> implements MyList<T> {
    // статическая константа
    private static final int DEFAULT_SIZE = 10;

    // сам список элементов
    private T elements[];
    // сколько всего элементов в списке
    private int count;

    public MyArrayList() {
        this.elements = (T[]) new Object[DEFAULT_SIZE];
        this.count = 0;
    }

    @Override
    public void add(T element) {
        if (count == elements.length) {
            resize();
        }
        elements[count] = element;
        count++;
    }

    private void resize() {
        T newElements[] = (T[]) new Object[elements.length + elements.length / 2];

        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }

        this.elements = newElements;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < count) {
            return elements[index];
        } else throw new IllegalArgumentException("Такого элемента нет!");
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void clear() {
        this.count = 0;
    }

    @Override
    public void removeAt(int index) {

    }

    @Override
    public void insert(int index, int element) {

    }

    @Override
    public void reverse() {

    }
}
