/**
 * 07.04.2021
 * Zukhra4
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MyLinkedList<T> implements MyList<T> {

    private Node<T> first;
    private Node<T> last;
    private int count;

    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (first == null) {
            first = newNode;
        } else {
            // следующий после последнего - новый узел
            last.next = newNode;

        }
        // новый узел - последний
        last = newNode;
        count++;

    }

    // TODO: реализовать самостоятельно
    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void clear() {
        count = 0;
        first = null;
        last = null;
    }

    //        current
    //           |
    //           V
    // Зухра -> Марсель -> Алия -> Виктор -> Максим -> Айрат
    // Даниил

    // TODO: оптимизировать код
    @Override
    public void removeAt(int index) {
        if (index >= 0 && index < count) {
            Node<T> current = first;

            if (index == 0) {
                first = first.next;
                count--;
                return;
            }

            if (index == count - 1) {
                last = null;
                count--;
                return;
            }

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
            count--;
        }
    }

    // TODO: самостоятельно
    @Override
    public void insert(int index, int element) {

    }

    @Override
    public void reverse() {
        Node<T> previous = first;
        Node<T> current = first.next;
        Node<T> next =  current.next;

        previous.next = null;
        last = previous;

        do {
            current.next = previous;

            previous = current;
            current = next;

            if (next != null) {
                next = next.next;
            }
        } while (current != null);

        first = previous;
    }
}
