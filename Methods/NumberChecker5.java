import java.util.Scanner;

public class NumberChecker5 {

    // Method to find factors and return them in an array
    static int[] findFactors(int number) {
        int count = 0;

        // First count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find greatest factor
    static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int number : factors) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    // Method to find sum of factors
    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int number : factors) {
            sum += number;
        }
        return sum;
    }

    // Method to find product of factors
    static int productOfFactors(int[] factors) {
        int product = 1;
        for (int number : factors) {
            product *= number;
        }
        return product;
    }

    // Method to find product of cubes of factors
    static double productOfCubes(int[] factors) {
        double product = 1;
        for (int number : factors) {
            product *= Math.pow(number, 3);
        }
        return product;
    }

    // Main method with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors of " + number + " are: ");
        for (int numberFac : factors) {
            System.out.print(numberFac + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + greatestFactor(factors));

        System.out.println("Sum of Factors: " + sumOfFactors(factors));

        System.out.println("Product of Factors: " + productOfFactors(factors));

        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));

        sc.close();
    }
}
