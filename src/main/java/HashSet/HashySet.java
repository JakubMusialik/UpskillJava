package HashSet;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class HashySet<T> implements Set<T> {

    private final Entry<T>[] bucket;
    private int size;

    public HashySet() {
        int capacity = 10;
        this.bucket = new Entry[capacity];
    }

    private int hash(int hashCode) {
        int index = hashCode;
        if (index < 0) {
            index = -index;
        }
        return index % bucket.length;
    }

    //checked //tested
    @Override
    public void add(T value) {
        int index = hash(value.hashCode());
        Entry temp = bucket[index];
        //checking if exists
        while (temp != null) {
            if (temp.getKey() == value) {
                return;
            }
            temp = temp.next;
        }
        //if doesn't exist add unique Entry
        Entry entry = new Entry(value);
        entry.setKey(value);
        entry.setNext(bucket[index]);
        bucket[index] = entry;
        size++;
    }

    //checked //tested
    @Override
    public void clear() {
        Arrays.fill(bucket, null);
        size = 0;
    }

    //checked //tested
    @Override
    public boolean contains(T value) {
        int index = hash(value.hashCode());
        Entry temp = bucket[index];

        while (temp != null) {
            // if Entry contains value
            if (temp.getKey().equals(value)) {
                return true;
            }
            temp = temp.getNext();
        }
        // no element found
        return false;
    }

    //checked //tested
    @Override
    public void remove(T value) {
        int index = hash(value.hashCode());
        Entry temp = bucket[index];
        Entry previous = null;

        while (temp != null) {
            // removing if element found
            if (temp.key.equals(value)) {
                if (previous == null) {
                    bucket[index] = temp.getNext();
                } else {
                    previous.setNext(temp.getNext());
                }
                size--;
                return;
            }
            previous = temp;
            temp = temp.getNext();
        }
        // if no such element throw exception
        throw new NoSuchElementException("No such element in collection");
    }

    //checked tested
    @Override
    public int size() {
        return size;
    }
}
