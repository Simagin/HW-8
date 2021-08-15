package main.java;

import java.util.Iterator;

public class MyLinkedList<T> implements InterfaceMyLinked<T> {

    public static class Node<T> {
        T item;
        Node<T> previous;
        Node<T> next;

        public Node(T item) {
            this.item = item;
        }
    }

    private Node<T> first;
    private Node<T> last;
    int size = 0;

    @Override
    public void add(T value) {
        Node<T> newNode = new Node<T>(value);
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        if(size == 0)
        {
            System.out.println("size colection - 0");
        }
        else {
            Node<T> node = getByIndex(index);
            if (node.previous == null) {
                first = node.next;
            } else {
                node.previous.next = node.next;
            }
            if (node.next == null) {
                last = node.previous;
            } else {
                node.next.previous = node.previous;
            }
            size--;
        }
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        return getByIndex(index).item;
    }

    private Node<T> getByIndex(int size) {
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private Node<T> node = first;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public T next() {
                T item = node.item;
                node = node.next;
                return item;
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()){

            }

        }
        sb.append("]");
        return sb.toString();
    }
}

