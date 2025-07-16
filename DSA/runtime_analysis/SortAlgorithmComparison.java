package com.algorithm_runtime_analysis;

import java.util.*;

public class SortAlgorithmComparison {

    public static void main(String[] args) {
        int size = 10000;

        // Generate random array of integers
        int[] original = new Random().ints(size, 1, 100000).toArray();

        // Clone original for each algorithm
        int[] bubbleArray = original.clone();
        int[] mergeArray = original.clone();
        int[] quickArray = original.clone();

        // Bubble Sort
        long start = System.currentTimeMillis();
        bubbleSort(bubbleArray);
        long end = System.currentTimeMillis();
        System.out.println("Bubble Sort Time: " + (end - start) + " ms");

        // Merge Sort
        start = System.currentTimeMillis();
        mergeSort(mergeArray, 0, mergeArray.length - 1);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort Time: " + (end - start) + " ms");

        // Quick Sort
        start = System.currentTimeMillis();
        quickSort(quickArray, 0, quickArray.length - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort Time: " + (end - start) + " ms");
    }

    // Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    // Merge Sort
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int s, int m, int e) {
        int[] temp = new int[e - s + 1];
        int i = s;
        int j = m + 1;
        int k = 0;
        while (i <= m && j <= e) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= m)
            temp[k++] = arr[i++];
        while (j <= e)
            temp[k++] = arr[j++];
        for (k = 0, i = s; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Quick Sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;
        return i + 1;
    }
}