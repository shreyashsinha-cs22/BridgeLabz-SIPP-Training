import java.util.Scanner;

// Base class
class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }

    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass: DeliveredOrder (Multilevel)
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class
public class OnlineRetailOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for a delivered order
        System.out.print("Enter Order ID: ");
        String orderId = scanner.nextLine();

        System.out.print("Enter Order Date: ");
        String orderDate = scanner.nextLine();

        System.out.print("Enter Tracking Number: ");
        String trackingNumber = scanner.nextLine();

        System.out.print("Enter Delivery Date: ");
        String deliveryDate = scanner.nextLine();

        // Create DeliveredOrder object
        DeliveredOrder order = new DeliveredOrder(orderId, orderDate, trackingNumber, deliveryDate);

        // Display details
        System.out.println("\n--- Order Details ---");
        order.displayDetails();
        System.out.println("Status: " + order.getOrderStatus());

        scanner.close();
    }
}
