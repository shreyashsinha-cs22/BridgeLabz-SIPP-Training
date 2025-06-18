import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String customSubstring(String input, int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int i = start; i < end && i < input.length(); i++) {
            result.append(input.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take full string input
        System.out.print("Enter the original text: ");
        String input = scanner.next();

        // Take start and end index
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Using built-in method
        String builtInSubstring = "";
        if (start >= 0 && end <= input.length() && start < end) {
            builtInSubstring = input.substring(start, end);
        } else {
            System.out.println("Invalid range for built-in substring.");
        }

        // Using custom method
        String customSub = customSubstring(input, start, end);

        // Compare both
        boolean areEqual = compareStrings(builtInSubstring, customSub);

        // Output results
        System.out.println("\nCustom substring:   " + customSub);
        System.out.println("Built-in substring: " + builtInSubstring);
        System.out.println("Are both equal?     " + areEqual);
    }
}
