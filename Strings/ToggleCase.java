import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String toggled = "";

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check and toggle case
            if (Character.isUpperCase(ch)) {
                toggled += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                toggled += Character.toUpperCase(ch);
            } else {
                toggled += ch; // leave non-letter characters unchanged
            }
        }

        // Output
        System.out.println("Toggled string: " + toggled);
    }
}
