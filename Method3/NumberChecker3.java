import java.util.Scanner;
public class NumberChecker3 {
    // Count of Digits
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

    // Store Digits in array
    static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] arr = new int[count];
        int temp = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }
        return arr;
    }

    // Reverse the array
    static int[] reverseArray(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }
        return reverse;
    }

    // Compare two arrays
    static boolean areEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Check palindrome number
    static boolean isPalindrome(int number) {
        int[] arr = storeDigits(number);
        int[] reverse = reverseArray(arr);
        return areEqual(arr, reverse);
    }

    // Check for duck number
    static boolean isDuck(int number) {
        int[] arr = storeDigits(number);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Main Method with User Input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        System.out.println("Count of Digits in Number: " + count);

        int[] arr = storeDigits(number);
        System.out.print("Digits array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] reverse = reverseArray(arr);
        System.out.print("Reversed array: ");
        for (int num : reverse) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean palindrome = isPalindrome(number);
        System.out.println(number + " is palindrome? " + palindrome);

        boolean duck = isDuck(number);
        System.out.println(number + " is a duck number? " + duck);

    }
}
