package com.stack_queue_hashMap_and_hashing_function;

import java.util.*;

public class PairWithGivenSum {
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

        // Input: Target sum
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        // Check for pair with given sum
        boolean found = hasPairWithSum(arr, target);

        // Output result
        if (found) {
            System.out.println("Pair with given sum exists in the array.");
        } else {
            System.out.println("No pair with the given sum exists in the array.");
        }

        // Close the scanner
        sc.close();
    }

    // Function to check for a pair with given sum using HashMap
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("Pair found: " + num + " + " + complement + " = " + target);
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}