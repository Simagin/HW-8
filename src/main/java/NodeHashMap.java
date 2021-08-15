package main.java;

import java.util.Objects;

class NodeHashMap<K, V> {

    V value;
    K key;
    int hash;
    NodeHashMap<K, V> next;
    MyHashMap<K, V> myHashMap = new MyHashMap<>();

    public NodeHashMap() {
    }

    public NodeHashMap(K key, V value) {
        this.value = value;
        this.key = key;
    }

    public int hashIndexArray() {
        int index = hashCode() & myHashMap.getArray().length - 1;
        return index;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public NodeHashMap<K, V> getNext() {
        return next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeHashMap<?, ?> node = (NodeHashMap<?, ?>) o;
        return key.equals(node.key);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 49 * hash + Objects.hashCode(key);
        this.hash = hash;
        return hash;
    }
}
