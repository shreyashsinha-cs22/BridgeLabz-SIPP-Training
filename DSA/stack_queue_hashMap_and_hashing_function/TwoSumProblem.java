package com.stack_queue_hashMap_and_hashing_function;

import java.util.*;

public class TwoSumProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Array size and elements
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input: Target sum
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        // Find indices of two numbers adding to target
        int[] result = twoSum(nums, target);

        // Output result
        if (result.length == 2) {
            System.out.println("Indices of numbers adding to target: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No such pair found.");
        }

        // Close the scanner
        sc.close();
    }

    // Function to find two indices adding to target sum using HashMap
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value → index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {}; // No solution
    }
}