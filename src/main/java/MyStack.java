package main.java;

public class MyStack<T> implements InterfaceMyStack<T> {

    private Node<T> first;
    private Node<T> last;
    int size = 0;

    @Override
    public void push(T value) {
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
            if (node.previous == null) first = node.next;
            else node.previous.next = node.next;
            if (node.next == null) last = node.previous;
            else node.next.previous = node.previous;
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
        return last.item;
    }

    @Override
    public T pop() {
        int index = size - 1;
        T delete = last.item;
        remove(index);
        return delete;
    }

    private Node<T> getByIndex(int size) {
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            current = current.next;
        }
        return current;
    }
}
