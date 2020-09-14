package app.collections.list;

import app.collections.Collection;

public interface List<T> extends Collection<T> {

    void add(int index, T element);

    boolean remove(int index);

    T get(int index);

    T set(int index, T element);

    int indexOf(Object element);

}
