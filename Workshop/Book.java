import java.util.ArrayList;
import java.util.*;
public class Book {
	private ArrayList<String> book;

	public Book() {
		book = new ArrayList<>();
	}

	public void addBook(String title, String author) {
		book.add(title + "-" + author);
	}

	public void sortBookAlphabetically() {
		for (int i = 0; i < book.size() - 1; i++) {
			for (int j = i + 1; j < book.size(); j++) {
				if (book.get(i).compareTo(book.get(j)) > 0) {
					String temp = book.get(i);
					book.set(i, book.get(j));
					book.set(j, temp);
				}
			}
		}
	}

	public void searchByAuthor(String author) {
		boolean flag = true;
		for (int i = 0; i < book.size(); i++) {
			String[] arr = book.get(i).split("-");
			if (arr[1].equals(author)) {
				System.out.println(arr[0]);
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Book does not contain");
		}
	}

	public void display() {
		if(book.size()==0) {
			System.out.println("No book available");
			return;
		}
		for (int i = 0; i < book.size(); i++) {
			String[] arr = book.get(i).split("-");
			System.out.println(arr[0] + " by " + arr[1]);
		}
	}
}

class Main {
    public static void main(String[] args) {
        Book myLibrary = new Book();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== BookBuddy Menu ====");
            System.out.println("1. Add Book");
            System.out.println("2. Sort Books Alphabetically");
            System.out.println("3. Search by Author");
            System.out.println("4. Display all available book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    myLibrary.addBook(title, author);
                    break;
                case 2:
                    myLibrary.sortBookAlphabetically();
                    System.out.println("Books sorted!");
                    break;
                case 3:
                    System.out.print("Enter author name to search: ");
                    String searchAuthor = scanner.nextLine();
                    myLibrary.searchByAuthor(searchAuthor);
                    break;
                case 4:
                	System.out.println("All available books: ");
                	myLibrary.display();
                	break;
                case 5:
                    System.out.println("Exiting");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}