import java.util.Scanner;
class SumOfNumbers {
    // Method to compute sum of n natural numbers using a loop
    static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from the user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // Calculate sum of n natural numbers
        int sum = sumOfNumbers(n);
        // Display the result
        System.out.println("The sum of first " + n + " natural numbers is " + sum);
    }
}
