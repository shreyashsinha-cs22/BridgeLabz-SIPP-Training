import java.util.*;
class Book {
    static String libraryName = "City Central Library";
    private String title;
    private String author;
    private final String isbn;
    // Constructor using 'this'
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("\nLibrary Name: " + libraryName);
    }
    // Display book details using instanceof
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("\n--- Book Details ---");
            System.out.println("Title : " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN  : " + isbn);
        } else {
            System.out.println("Invalid Book Object.");
        }
    }
}

class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title1 = sc.nextLine();
        System.out.print("Enter author name: ");
        String author1 = sc.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn1 = sc.nextLine();
        Book book1 = new Book(title1, author1, isbn1);
        Book.displayLibraryName();
        book1.displayBookDetails();
    }
}
