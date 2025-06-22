import java.util.Scanner;

public class StringLengthFinder {
    // Method to get string length without using .length() 
    public static int getStringLength(String str) {
        char[] chars = str.toCharArray(); // convert string to char array
        int count = 0;

        for (char ch : chars) {
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.next();
        int manualLength = getStringLength(input);
        int builtinLength = input.length(); 
        System.out.println("Manual length: " + manualLength);
        System.out.println("Built-in length (.length()): " + builtinLength);
    }
}
