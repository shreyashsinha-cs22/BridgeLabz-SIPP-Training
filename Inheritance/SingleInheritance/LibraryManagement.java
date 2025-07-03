import java.util.Scanner;

// Superclass: Book
class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author (inherits Book)
class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter publication year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter author name: ");
        String authorName = scanner.nextLine();

        System.out.print("Enter author bio: ");
        String authorBio = scanner.nextLine();

        // Create Author object
        Author book = new Author(title, year, authorName, authorBio);

        // Display details
        System.out.println("\n--- Book and Author Details ---");
        book.displayInfo();

        scanner.close();
    }
}
