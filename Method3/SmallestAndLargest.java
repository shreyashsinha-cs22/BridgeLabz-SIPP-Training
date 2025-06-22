import java.util.Scanner;

class SmallestAndLargest {

    // Method to find the smallest and largest number
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2]; // first -> smallest, Second -> largest

        int smallest = Math.min(number1, Math.min(number2, number3)); 
        int largest = Math.max(number1, Math.max(number2, number3));

        result[0] = smallest;
        result[1] = largest;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for 3 numbers
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Find the smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the results
        System.out.println("Smallest number is: " + result[0]);
        System.out.println("Largest number is: " + result[1]);

        sc.close();
    }
}
