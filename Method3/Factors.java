import java.util.Scanner;
class Factors {
    // Method to find factors and return them in an array
    static int[] findFactors(int number) {
        int count = 0;
        // First loop to count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        // Second loop to save factors into array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    // Method to calculate sum of factors
    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    // Method to calculate product of factors
    static int productOfFactors(int[] factors) {
        int product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }
    // Method to calculate sum of squares of factors
    static int sumOfSquaresOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input for number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Find factors
        int[] factors = findFactors(number);
        // Display factors
        System.out.print("Factors of " + number + " are: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();
        // Calculate sum, sum of squares, and product
        int sum = sumOfFactors(factors);
        int sumOfSquares = sumOfSquaresOfFactors(factors);
        int product = productOfFactors(factors);
        // Display results
        System.out.println("Sum of factors = " + sum);
        System.out.println("Product of factors = " + product);
        System.out.println("Sum of squares of factors = " + sumOfSquares);
    }
}
