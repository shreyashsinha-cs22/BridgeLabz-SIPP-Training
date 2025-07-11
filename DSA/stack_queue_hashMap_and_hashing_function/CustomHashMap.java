package com.stack_queue_hashMap_and_hashing_function;

import java.util.*;

public class CustomHashMap<K, V> {
    // Node class representing key-value pairs
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity = 16;
    private Node<K, V>[] buckets;

    // Constructor
    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = new Node[capacity];
    }

    // Hash function to get bucket index
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // Insert or update key-value pair
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        Node<K, V> head = buckets[index];

        // Check if key already exists; if yes, update value
        Node<K, V> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        // Insert new node at the head (chaining)
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

    // Retrieve value by key
    public V get(K key) {
        int index = getBucketIndex(key);
        Node<K, V> current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null; // Key not found
    }

    // Delete key-value pair by key
    public void remove(K key) {
        int index = getBucketIndex(key);
        Node<K, V> current = buckets[index];
        Node<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    // Display entire map for testing
    public void display() {
        for (int i = 0; i < capacity; i++) {
            Node<K, V> current = buckets[i];
            System.out.print("Bucket " + i + ": ");
            while (current != null) {
                System.out.print("[" + current.key + " : " + current.value + "] -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        // Insert key-value pairs
        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Cherry", 40);
        map.put("Apple", 60); // Update Apple

        // Display map
        System.out.println("Custom Hash Map:");
        map.display();

        // Retrieve values
        System.out.println("\nValue for 'Banana': " + map.get("Banana"));
        System.out.println("Value for 'Apple': " + map.get("Apple"));

        // Remove key
        map.remove("Banana");
        System.out.println("\nAfter removing 'Banana':");
        map.display();
    }
}