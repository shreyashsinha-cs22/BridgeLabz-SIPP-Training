package com.stack_queue_hashMap_and_hashing_function;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Array size, elements, and window size k
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the window size k: ");
        int k = sc.nextInt();

        // Calculate sliding window maximums
        int[] result = slidingWindowMax(nums, k);

        // Output: Maximums of all windows
        System.out.println("Maximums of each sliding window:");
        for (int max : result) {
            System.out.print(max + " ");
        }

        // Close the scanner
        sc.close();
    }

    // Function to compute sliding window maximums using deque
    public static int[] slidingWindowMax(int[] nums, int k) {
        int n = nums.length;
        int[] maxes = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); // Stores indices

        for (int i = 0; i < n; i++) {
            // Remove indices outside the current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove indices of smaller elements within current window
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Record max for current window (when window is fully formed)
            if (i >= k - 1) {
                maxes[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return maxes;
    }
}