import java.util.*;
public class PerfecNumber {
    // Check if a number is perfect
    static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // Check if a number is abundant
    static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }

    // Check if a number is deficient
    static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }

    // Check if a number is strong
    static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    // Helper method to compute factorial
    static int factorial(int n) {
        int fac = 1;
        for (int i = 2; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    // main method to demonstrate functionality
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(number + " is perfect? " + isPerfect(number)); 
        System.out.println(number + " is abundant? " + isAbundant(number)); 
        System.out.println(number + " is deficient? " + isDeficient(number)); 
        System.out.println(number + " is strong? " + isStrong(number)); 
    }
}
