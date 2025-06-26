import java.util.*;

class Product {
    // Static discount shared by all products (e.g., 10 means 10% discount)
    static double discount = 10.0;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;
    private final String productID;  // Final: cannot be changed

    // Constructor using 'this' keyword
    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update the discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("\nDiscount updated to " + discount + "%");
    }

    // Method to display product details with instanceof check
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("\n--- Product Details ---");
            System.out.println("Product ID   : " + productID);
            System.out.println("Product Name : " + productName);
            System.out.println("Price        : ₹" + price);
            System.out.println("Quantity     : " + quantity);
            System.out.println("Discount     : " + discount + "%");
            double total = (price * quantity);
            double discountedPrice = total - (total * discount / 100);
            System.out.println("Total after discount: ₹" + discountedPrice);
        } else {
            System.out.println("Invalid Product Object.");
        }
    }
}

class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first product
        System.out.print("Enter product name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter price: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int qty1 = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter product ID: ");
        String id1 = sc.nextLine();

        Product prod1 = new Product(name1, price1, qty1, id1);
        prod1.displayProductDetails();

        // Update discount
        System.out.print("\nEnter new discount percentage: ");
        double newDiscount = sc.nextDouble();
        Product.updateDiscount(newDiscount);

        sc.nextLine(); // consume newline

        // Input for second product
        System.out.print("\nEnter another product name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter price: ");
        double price2 = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int qty2 = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter product ID: ");
        String id2 = sc.nextLine();

        Product prod2 = new Product(name2, price2, qty2, id2);
        prod2.displayProductDetails();

        sc.close();
    }
}
