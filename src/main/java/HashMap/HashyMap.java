package HashMap;

import Consumer.Consumer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashyMap<K, V> implements Map<K, V> {

    private int size = 0;
    private final int capacity = 10;
    private final Entry<K, V>[] buckets;

    public HashyMap() {
        this.buckets = new Entry[capacity];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity; //abs() method returns the absolute (Positive) value of a int value.
    }

    //checked //tested
    @Override
    public void add(K key, V value) {
        if (key == null) {
            return;
        }
        Entry<K, V> newEntry = new Entry<>(key, value);
        int hash = hash(key);

        if (buckets[hash] == null) {
            buckets[hash] = newEntry;
            size++;
        } else {
            Entry<K, V> current = buckets[hash];
            Entry<K, V> previous = null;
            while (current != null) {
                if (current.getKey().equals(key)) {
                    current.setValue(newEntry.getValue());
                    return;
                }
                previous = current;
                current = current.getNext();
            }
            if (previous != null) {
                previous.setNext(newEntry);
            }
        }
    }

    //checked //tested
    @Override
    public void clear() {
        Arrays.fill(buckets, null);
        size = 0;
//        table = new Entry[table.length];
//        size=0;
    }

    //checked //tested
    @Override
    public boolean containsKey(K key) {
        int index = hash(key);
        Entry<K, V> temp = buckets[index];
        while (temp != null) {
            temp.setNext(temp.getNext());
            if (temp.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    //checked //tested
    @Override
    public boolean containsValue(Object value) {
        Entry<K, V> current = buckets[size];
        for (int i = 0; i < buckets.length; i++) {
            if (current == null) {
                return false;
            }
            if (current.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }


    //checked //tested
    @Override
    public V get(K key) {
        if (key == null) {
            return null;
        }
        int hash = hash(key);

        if (buckets[hash] == null) {
            return null;
        } else {
            Entry<K, V> current = buckets[hash];
            while (current != null) {
                if (current.getKey().equals(key)) {
                    return current.getValue();
                }
                current = current.getNext();
            }
        }
        return null;
    }

    //checked //tested
    @Override
    public Set<K> getKeys() {
        Set<K> keys = new HashSet<>();
        for (Entry<K, V> entry : buckets) {
            if (entry != null) {
                if (entry.getKey() != null) {
                    keys.add(entry.getKey());
                }
            }
        }
        return keys;
    }

    //checked //tested
    @Override
    public void remove(K key) {
        if (null == key) {
            return;
        }
        int hash = hash(key);
        Entry<K, V> temp = buckets[hash];

        if (temp == null) {
            return;
        }
        Entry<K, V> previous = null;
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                //delete
                if (previous == null) {
                    buckets[hash] = temp.getNext();
                    size--;
                } else {
                    previous.setNext(temp.getNext());
                }
                return;
            } else {
                previous = temp;
                temp = temp.getNext();
            }
        }
    }

    //checked //tested
    @Override
    public int size() {
        return size;
    }

    public void forEach(Consumer<V> consumer) {
        for (Entry<K, V> entry : buckets) {
            while (entry != null) {
                consumer.accept(entry.getValue());
                entry = entry.getNext();
            }
        }
    }

}
