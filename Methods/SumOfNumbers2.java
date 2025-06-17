import java.util.Scanner;
public class SumOfNumbers2 {
    // Method to compute sum of n natural numbers using recursion
    static int sumUsingRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumUsingRecursive(n - 1);
        }
    }
    // Method to compute sum using formula n(n+1)/2
    static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number. Please enter a natural number.");
        } else {
            int sumRecursive = sumUsingRecursive(n);
            int sumFormula = sumUsingFormula(n);

            System.out.println("Sum using recursion = " + sumRecursive);
            System.out.println("Sum using formula = " + sumFormula);

            if (sumRecursive == sumFormula) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("The results do not match.");
            }
        }
    }
}
