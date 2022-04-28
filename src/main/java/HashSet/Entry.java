package HashSet;

import java.util.Objects;

public class Entry<T> {

    T key;

    Entry next;

    public Entry(T key) {
        this.key = key;
        next = null;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public Entry getNext() {
        return next;
    }

    public void setNext(Entry next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return getKey() == entry.getKey();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey());
    }
}
