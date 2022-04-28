package LinkedList;

public interface List<T> {

    void add(T value);

    void clear();

    boolean contains(T value);

    T get(int index);

    void remove(int index);

    int size();

    int indexOf(T value);

}
