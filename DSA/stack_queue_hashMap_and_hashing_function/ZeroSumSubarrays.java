package com.stack_queue_hashMap_and_hashing_function;

import java.util.*;

public class ZeroSumSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Array size and elements
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and display all subarrays with zero sum
        List<int[]> result = findZeroSumSubarrays(arr);

        System.out.println("Zero-sum subarrays (start to end index):");
        if (result.isEmpty()) {
            System.out.println("No zero-sum subarrays found.");
        } else {
            for (int[] subarray : result) {
                System.out.println(Arrays.toString(subarray));
            }
        }

        // Close the scanner
        sc.close();
    }

    // Function to find all zero-sum subarrays
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> subarrays = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // Initialize with sum = 0 at index -1 to capture subarrays starting at index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum already seen, it means subarray(s) with zero sum exist
            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    subarrays.add(new int[] { startIndex + 1, i });
                }
            }

            // Add current index to list of indices for this sum
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        return subarrays;
    }
}