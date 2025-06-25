import java.util.Scanner;
public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;
    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment when a new product is created
    }
    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("\nProduct Details:");
        System.out.println("Name  : " + productName);
        System.out.println("Price : ₹" + price);
    }
    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("\nTotal number of products created: " + totalProducts);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine(); 
        Product product1 = new Product(name1, price1);
        product1.displayProductDetails();
        Product.displayTotalProducts();
        System.out.print("\nEnter another product name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price2 = scanner.nextDouble();
        Product product2 = new Product(name2, price2);
        product2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
