package main.java;
import java.util.*;

public interface InterfaceMyQueue<T> extends Iterable<T>{

    void add(T value);
    void remove(int index);
    void clear();
    int size();
    T peek();
    T poll();

}
