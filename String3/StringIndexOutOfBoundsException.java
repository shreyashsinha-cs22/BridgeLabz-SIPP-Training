import java.util.Scanner;

class StringIndexOutOfBoundsDemo {

    // Method to generate the StringIndexOutOfBoundsException without handling
    public static void generateException(String input) {
        // This will throw StringIndexOutOfBoundsException if index is out of bounds
        System.out.println("Character at invalid index: " + input.charAt(input.length()));
    }


    public static void handleException(String input) {
        try {
            System.out.println("Character at invalid index: " + input.charAt(input.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of range.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main method to execute both generate and handle methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call method that causes exception
        try {
            generateException(userInput);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception in generateException: " + e.getMessage());
        }

        // Call method that handles the exception
        handleException(userInput);
    }
}
