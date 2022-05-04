package LinkedList;

import Consumer.Consumer;

public class LinkyList<T> implements List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    //checked //tested
    @Override
    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        ++size;
    }

    //checked //tested
    @Override
    public void clear() {
        if (size > 0) {
            tail = null;
            head = null;
            size = 0;
        }
    }

    //checked //tested
    @Override
    public boolean contains(T value) {
        Node<T> current = head;

        while (current != null) {
            if (value.equals(current.getValue())) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    //checked //tested //dopisać wyjątek zamiast return null IndexOutOfBounds
    @Override
    public T get(int index) {
        if (index > size || size == 0) {
            throw new IndexOutOfBoundsException("No such index in the list");
        }
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp.getValue();
    }

    //checked //tested //Wyjątki na samej górze
    @Override
    public void remove(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("No such index in the list");
        }
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }
        Node current = head;
        if (head != null) {
            for (int i = 1; i < index; i++) {
                if (current.getNext() == null)
                    return;
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            size--;
        }
    }

    //checked //tested
    @Override
    public int size() {
        return size;
    }

    //checked //testing
    @Override
    public int indexOf(T value) {
        int index = 0;
        Node current = head;

        while (current != null) {
            if (current.getValue().equals(value)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    public void forEach(Consumer<T> consumer) {
        Node<T> temp = head;
        while (temp.getNext() != null) {
            consumer.accept(temp.getValue());
            temp = temp.getNext();
            if (temp.getNext() == null) {
                consumer.accept(tail.getValue());
            }
        }
    }

}