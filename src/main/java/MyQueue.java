package main.java;

import java.util.*;

public class MyQueue<T> implements InterfaceMyQueue<T> {

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
        if (size == 0) {
            System.out.println("size colection - 0");
        } else {
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
    public T peek() {
        return first.item;
    }

    @Override
    public T poll() {
        int index = 0;
        T delete = first.item;
        remove(index);
        return delete;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private Node<T> getByIndex(int size) {
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            current = current.next;
        }
        return current;
    }
}
