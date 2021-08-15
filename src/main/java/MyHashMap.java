package main.java;

public class MyHashMap<K, V> implements InterfaceMyHashMap<K, V> {

    private NodeHashMap<K, V>[] array;
    private int CAPACITY = 16;
    private int count = 0;
    private float sizeArray;

    public NodeHashMap<K, V>[] getArray() {
        return array;
    }

    public MyHashMap() {
        array = new NodeHashMap[CAPACITY];
    }

    @Override
    public void put(K key, V value) {
        NodeHashMap<K, V> newNode = new NodeHashMap<K, V>(key, value);
        int index = newNode.hashIndexArray();
        if (array[index] == null) {
            array[index] = newNode;
        } else {
            NodeHashMap<K, V> previous = null;
            NodeHashMap<K, V> current = array[index];
            while (current != null) {
                if (current.key.equals(key)) {
                    if (previous == null) {
                        newNode.next = current.next;
                        array[index] = newNode;
                        return;
                    } else {
                        newNode.next = current.next;
                        previous.next = newNode;
                        return;
                    }
                }
                previous = current;
                current = current.next;
            }
            previous.next = newNode;
        }
        count++;
    }

    @Override
    public void remove(K key) {
        if(count == 0)
        {
            System.out.println("size colection - 0");
        }
        else {
            NodeHashMap<K, V> newNode = new NodeHashMap<K, V>(key, null);
            int index = newNode.hashIndexArray();
            if (array[index].next == null) {
                array[index] = null;
            } else {
                NodeHashMap<K, V> previous = null;
                NodeHashMap<K, V> current = array[index];
                while (current != null) {
                    if (current.key.equals(key)) {

                        if (previous == null) {
                            array[index] = current.next;
                        } else {
                            previous.next = current.next;
                        }
                    }
                    previous = current;
                    current = current.next;
                }
            }
            count--;
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        count = 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public V get(K key) {
        NodeHashMap<K, V> node = new NodeHashMap<K, V>();
        node.key = key;
        int index = node.hashIndexArray();
        NodeHashMap<K, V> current = array[index];
        while (current != null) {
            if (current.key.equals(key)) {
                break;
            }
            current = current.next;
        }
        return current.value;
    }
}
