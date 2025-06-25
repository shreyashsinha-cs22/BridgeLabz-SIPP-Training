import java.util.Scanner;
public class Book {
    private String title;
    private String author;
    private double price;
    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("\nBook Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter the author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter the book price: ");
        double price = scanner.nextDouble();
        Book userBook = new Book(title, author, price);
        userBook.displayInfo();
    }
}
