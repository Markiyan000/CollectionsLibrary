package app.collections;

public interface Collection<T> {

    boolean add(T element);

    boolean remove(Object element);

    boolean contains(Object element);

    void clear();

    boolean isEmpty();

    int size();
}
