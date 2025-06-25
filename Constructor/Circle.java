import java.util.Scanner;
public class Circle {
    private double radius;
    // Default constructor
    public Circle() {
        this(1.0); // Constructor chaining with default radius
    }
    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }
    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    // Method to display details
    public void displayInfo() {
        System.out.println("\nCircle Details:");
        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + getArea());
        System.out.println("Circumference : " + getCircumference());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double userRadius = scanner.nextDouble();
        Circle userCircle = new Circle(userRadius);
        userCircle.displayInfo();
    }
}
