package app.collections.list;

public class ArrayList<T> implements List<T> {

    private Object []elements;

    private int size;

    private final int DEFAULT_CAPACITY = 10;

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, T element) {

    }

    public boolean remove(int index) {
        return false;
    }

    public T get(int index) {
        return null;
    }

    public T set(int index, T element) {
        return null;
    }

    public int indexOf(Object element) {
        return 0;
    }

    public boolean add(T element) {
        return false;
    }

    public boolean remove(Object element) {
        return false;
    }

    public boolean contains(Object element) {
        return false;
    }

    public void clear() {

    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return 0;
    }
}
