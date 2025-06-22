import java.util.Scanner;
public class CharArrayComparison {
    // Method to convert a string to a character array without using toCharArray()
    public static char[] customCharArray(String input) {
        char[] chars = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            chars[i] = input.charAt(i);
        }
        return chars;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    // Method to print character array
    public static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        char[] customArray = customCharArray(input);
        char[] builtInArray = input.toCharArray();
        boolean areEqual = compareCharArrays(customArray, builtInArray);
        System.out.print("Characters from custom method : ");
        printCharArray(customArray);
        System.out.print("Characters from toCharArray() : ");
        printCharArray(builtInArray);
        System.out.println("Are both arrays equal?         : " + areEqual);
    }
}
