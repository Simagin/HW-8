package main.java;

public interface InterfaceMyLinked<T> extends Iterable<T> {
    void add(T value);
    void remove(int index);
    void clear();
    int size();
    T get(int index);

}
