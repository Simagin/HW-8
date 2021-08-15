package main.java;

import java.util.*;

public class MyArrayList<T> implements InterfaceMyArray<T> {
    private T[] arr;
    private int counter ;
    private int index = 10;

    public MyArrayList() {
        arr = (T[]) new Object[index];
        counter = 0;
    }

    @Override
    public void add(T value) {
        if(counter == index) {
            index*=2;
            arr = Arrays.copyOf(arr, index);
        }
        arr[counter] = value;
        counter++;
    }

    @Override
    public void remove(int number) {
        if(counter == 0)
        {
            System.out.println("size colection - 0");
        }
        else {
            if (number >= counter) {
                throw new RuntimeException();
            }
            int last = counter - number;
            System.arraycopy(arr, number + 1, arr, number, last);
            counter--;
        }
    }

    @Override
    public void clear() {
        counter = 0;
        Arrays.copyOf(arr, 0);
        index = 10;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public T get(int index) {
        if(index >= counter){
            throw new RuntimeException();
        }
        return arr[index];
    }


    @Override
    public String toString() {
        T[] arrey = Arrays.copyOf(arr, counter);
        return Arrays.toString(arrey);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
