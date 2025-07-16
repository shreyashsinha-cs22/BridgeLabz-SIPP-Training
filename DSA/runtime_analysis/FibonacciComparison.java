public class FibonacciComparison {
    // Recursive Fibonacci
    // Time Complexity: O(2^n)
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci
    // Time Complexity: O(n)
    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 30;

        // Measure time for recursive Fibonacci
        long start = System.nanoTime();
        fibonacciRecursive(n);
        long end = System.nanoTime();
        System.out.println("Recursive: " + (end - start) / 1e6 + "ms");

        // Measure time for iterative Fibonacci
        start = System.nanoTime();
        fibonacciIterative(n);
        end = System.nanoTime();
        System.out.println("Iterative: " + (end - start) / 1e6 + "ms");
    }
}