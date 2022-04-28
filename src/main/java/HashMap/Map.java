package HashMap;


import java.util.Set;

public interface Map<K,V> {

    void add(K key, V value);

    void clear();

    boolean containsKey(K key);

    boolean containsValue(V value);

    V get(K key);

    Set<K> getKeys();

    void remove(K key);

    int size();
}
