import java.util.Scanner;

class ChocolateDistribution {

    // Method to find the number of chocolates each child gets and the remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; 

        result[0] = number / divisor;
        result[1] = number % divisor;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of chocolates
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        // Take input for number of children
        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        // Calculate number of chocolates per child and remainder
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        int perChild = result[0];
        int remainder = result[1 ];

        // Display the results
        System.out.println("Each child gets: " + perChild + " chocolates.");
        System.out.println("Remaining chocolates: " + remainder);

        sc.close();
    }
}
