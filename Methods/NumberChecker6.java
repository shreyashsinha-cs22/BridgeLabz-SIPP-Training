import java.util.Scanner;
public class NumberChecker6 {
 
    static int countDigits(int number) {
        int count = 0;
        int temp = Math.abs(number);
        if (temp == 0) return 1;

        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Store the digits in an array
    static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Find sum of the digits
    static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Find sum of the squares of the digits
    static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Check if number is Harshad
    static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Find frequency of each digit
    static int[][] frequencyOfDigits(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }
        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) count++;
        }

        int[][] freqTable = new int[count][2];
        int index = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                freqTable[index][0] = i;
                freqTable[index][1] = freq[i];
                index++;
            }
        }

        return freqTable;
    }

    // Main method with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Count of Digits: " + count);
        System.out.print("Digits in Number: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int sum = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + sum);

        int sumOfSquares = sumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + sumOfSquares);

        boolean isHarshad = isHarshad(number, digits);
        System.out.println("Harshad Number: " + isHarshad);

        int[][] freqTable = frequencyOfDigits(digits);
        System.out.println("Frequency of Digits:");
        for (int[] row : freqTable) {
            System.out.println("Digit " + row[0] + " -> " + row[1]);
        }

        sc.close();
    }
}
