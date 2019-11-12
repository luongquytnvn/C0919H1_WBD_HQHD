import java.util.Arrays;
public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }
    public void add(int index, E element) {
        elements[index] = element;
    }
    public E remove(int index) {
        if (index>=0 && index <elements.length) {
            for (int i = index; i<elements.length-1;i++) {
                elements[i] = elements[i + 1];
            }
            elements[elements.length-1] = 0;
        } else {
            System.out.println("Error");
        }

    }
}
