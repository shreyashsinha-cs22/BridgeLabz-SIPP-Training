import java.util.Scanner;
public class Library {
    private String title;
    private String author;
    private double price;
    private boolean available;
    // Parameterized constructor
    public Library(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }
    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            System.out.println("You have successfully borrowed \"" + title + "\".");
            available = false; // Mark the book as not available
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }
    // Method to display book details
    public void displayInfo() {
        System.out.println("\nBook Details:");
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : ₹" + price);
        System.out.println("Available   : " + (available ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        // Create a book object (initially available)
        Library book = new Library(title, author, price, true);
        // Display book info before borrowing
        book.displayInfo();
        // Attempt to borrow the book
        System.out.print("\nDo you want to borrow this book? (yes/no): ");
        scanner.nextLine(); // Consume leftover newline
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            book.borrowBook();
        }
        book.displayInfo();
    }
}
