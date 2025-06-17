import java.util.Scanner;

public class Armstrong {

    // Count number of digits
    static int countDigits(int number) {
        int count = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    // Store the digits in an array
    static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digitArray = new int[count];
        int temp = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digitArray[i] = temp % 10;
            temp /= 10;
        }
        return digitArray;
    }

    // Check if number is a duck number
    static boolean isDuckNumber(int number) {
        int[] digitArray = storeDigits(number);
        for (int digit : digitArray) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    // Check if number is Armstrong number
    static boolean isArmstrong(int number) {
        int[] digitArray = storeDigits(number);
        int count = digitArray.length;

        int sum = 0;
        for (int digit : digitArray) {
            sum += Math.pow(digit, count);
        }
        return sum == number;
    }

    // Find largest and 2nd largest
    static int[] findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }

        return new int[]{largest, secondLargest}; // [largest, 2nd largest]
    }

    // Find smallest and 2nd smallest
    static int[] findSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : arr) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number > smallest) {
                secondSmallest = number;
            }
        }

        return new int[]{smallest, secondSmallest}; // [smallest, 2nd smallest]
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        System.out.println("Digits Count: " + count);

        int[] digitArray = storeDigits(number);
        System.out.print("Digits in number: ");
        for (int d : digitArray) {
            System.out.print(d + " ");
        }
        System.out.println();

        boolean isDuck = isDuckNumber(number);
        System.out.println("Is a duck number? " + isDuck);

        boolean isArmstrong = isArmstrong(number);
        System.out.println("Is Armstrong Number? " + isArmstrong);

        int[] largest = findLargest(digitArray);
        System.out.println("Largest: " + largest[0] + ", Second largest: " + largest[1]);

        int[] smallest = findSmallest(digitArray);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
