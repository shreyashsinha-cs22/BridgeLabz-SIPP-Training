import java.util.*;

// Taxable Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        setProductId(productId);
        setName(name);
        setPrice(price);
    }

    // Encapsulation: Getters and Setters
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setProductId(int id) { this.productId = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) {
        this.price = price > 0 ? price : 0;
    }

    // Abstract method
    public abstract double calculateDiscount();

    // Concrete method
    public void displayProduct() {
        System.out.println("\n--- Product Details ---");
        System.out.println("ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Discounted Price: ₹" + (price - calculateDiscount()));
    }
}

// Electronics class
class Electronics extends Product implements Taxable {
    private int warrantyInMonths;

    public Electronics(int id, String name, double price, int warranty) {
        super(id, name, price);
        this.warrantyInMonths = warranty;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Electronics GST (18%): ₹" + calculateTax();
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Warranty: " + warrantyInMonths + " months");
        System.out.println(getTaxDetails());
    }
}

// Clothing class
class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "Clothing GST (5%): ₹" + calculateTax();
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Size: " + size);
        System.out.println(getTaxDetails());
    }
}

// Groceries class
class Groceries extends Product {
    private double weightKg;

    public Groceries(int id, String name, double price, double weightKg) {
        super(id, name, price);
        this.weightKg = weightKg;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("No tax applicable on groceries.");
    }
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for product #" + i);
            System.out.println("1. Electronics\n2. Clothing\n3. Groceries");
            System.out.print("Choose product type (1-3): ");
            int type = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter Product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Price: ₹");
            double price = scanner.nextDouble();
            scanner.nextLine();

            switch (type) {
                case 1:
                    System.out.print("Enter Warranty (in months): ");
                    int warranty = scanner.nextInt();
                    scanner.nextLine();
                    productList.add(new Electronics(id, name, price, warranty));
                    break;

                case 2:
                    System.out.print("Enter Size (e.g., M, L, XL): ");
                    String size = scanner.nextLine();
                    productList.add(new Clothing(id, name, price, size));
                    break;

                case 3:
                    System.out.print("Enter Weight (in kg): ");
                    double weight = scanner.nextDouble();
                    scanner.nextLine();
                    productList.add(new Groceries(id, name, price, weight));
                    break;

                default:
                    System.out.println("Invalid choice. Skipping this product.");
            }
        }

        // Display all products
        System.out.println("\n========== All Product Details ==========");
        for (Product p : productList) {
            p.displayProduct();
        }

        scanner.close();
    }
}
