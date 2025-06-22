import java.util.Scanner;
public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();
        // Generate and print the sequence
        printFibonacci(terms);
    }

    // Method to generate and print Fibonacci sequence
    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return;
        }

        int a = 0, b = 1;

        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
