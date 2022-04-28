package HashSet;

public interface Set<T> {

    void add(T value);

    void clear();

    boolean contains(T value);

    void remove(T value);

    int size();
}
