import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input main string and substring
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter the substring to search for: ");
        String subStr = sc.nextLine();

        int count = 0;
        int index = 0;

        // Search for substring occurrences
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index++; // Move one character forward to allow overlapping matches
        }

        // Output
        System.out.println("The substring '" + subStr + "' occurs " + count + " times.");
    }
}
