package main.java;

public class Node<T> {

    T item;
    Node<T> previous;
    Node<T> next;

    public Node(T item) {
        this.item = item;
    }
}
