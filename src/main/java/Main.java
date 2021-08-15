package main.java;

import java.util.ArrayList;

public class Main {

    public void myHashMapMethod() {

        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        // myHashMap.remove("ssdd");
        myHashMap.put("vasya", 1000);
        myHashMap.put("vasya", 2000);
        myHashMap.put("ererter", 1000);
        myHashMap.put("petya", 2000);
        myHashMap.put("jon", 3000);
        myHashMap.put("asdasd", 2000);
        myHashMap.put("vhhhhhjf,yfd,d.asya", 2000);
        myHashMap.put("sfgdfsgdfgd", 2000);
        System.out.println(myHashMap.size());
        System.out.println(myHashMap.get("ererter"));

    }

    public void myStackMethod() {

        MyStack<String> myStack = new MyStack<>();
        myStack.remove(1);
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        myStack.push("4");
        myStack.push("5");
        myStack.push("6");
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        myStack.push("8");
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());

    }

    public void myQueueMethod() {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.remove(1);
        myQueue.add("1");
        myQueue.add("2");
        myQueue.add("3");
        myQueue.add("4");
        myQueue.add("5");
        myQueue.add("6");
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        myQueue.add("7");
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.size);
        myQueue.clear();
        myQueue.add("777");
        System.out.println(myQueue.peek());
        System.out.println(myQueue.size());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.size());

    }

    public void myArrayListMethod() {

        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.remove(3);
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("5");
        myArrayList.remove(3);
        myArrayList.clear();
        myArrayList.add("99");
        myArrayList.add("99");

        System.out.println(myArrayList);

    }

    public void myLinkedListMethod() {

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.remove(1);
        myLinkedList.add("один");
        myLinkedList.add("два");
        myLinkedList.add("три");
        myLinkedList.add("четыри");
        myLinkedList.add("пять");
        myLinkedList.add("шесть");
        myLinkedList.remove(4);
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.size);

    }

    public static void main(String[] args) {

        Main main = new Main();
        main.myHashMapMethod();
        main.myStackMethod();
        main.myQueueMethod();
        main.myArrayListMethod();
        main.myLinkedListMethod();

    }
}
