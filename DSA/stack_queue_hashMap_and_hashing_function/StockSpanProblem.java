package com.stack_queue_hashMap_and_hashing_function;

import java.util.Scanner;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of days and stock prices
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter the stock prices for " + n + " days:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int[] span = calculateSpan(prices, n);

        // Output: Stock spans
        System.out.println("Stock spans for each day:");
        for (int s : span) {
            System.out.print(s + " ");
        }

        // close the scanner
        sc.close();
    }

    // Function to calculate stock spans
    public static int[] calculateSpan(int[] prices, int n) {
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); // Stores indices of days

        // Span for first day is always 1
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {
            // Pop prices from stack that are less than or equal to current day's price
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

            // Calculate span
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current day's index to stack
            stack.push(i);
        }

        return span;
    }
}