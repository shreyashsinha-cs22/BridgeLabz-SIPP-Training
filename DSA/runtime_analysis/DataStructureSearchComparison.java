package com.algorithm_runtime_analysis;

import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        int size = 1_000_000, target = size - 1;

        // Create a large dataset
        Integer[] data = new Integer[size];
        for (int i = 0; i < size; i++)
            data[i] = i;

        // Convert to different data structures
        // ArrayList, HashSet, and TreeSet
        List<Integer> arrayList = Arrays.asList(data);
        HashSet<Integer> hashSet = new HashSet<>(arrayList);
        TreeSet<Integer> treeSet = new TreeSet<>(arrayList);

        // Search in ArrayList, HashSet, and TreeSet
        // Measure time for each search operation
        long start = System.nanoTime();
        arrayList.contains(target);
        long end = System.nanoTime();
        System.out.println("Array: " + (end - start) / 1e6 + "ms");

        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet: " + (end - start) / 1e6 + "ms");

        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet: " + (end - start) / 1e6 + "ms");
    }
}