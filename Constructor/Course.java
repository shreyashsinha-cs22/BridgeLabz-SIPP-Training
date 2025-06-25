import java.util.Scanner;
public class Course {
    private String courseName;
    private String duration;
    private double fee;
    private static String instituteName = "GLA University";
    // Constructor
    public Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("\nCourse Details:");
        System.out.println("Institute : " + instituteName);
        System.out.println("Course    : " + courseName);
        System.out.println("Duration  : " + duration);
        System.out.println("Fee       : ₹" + fee);
    }
    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("\nInstitute name updated to: " + instituteName);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter course duration: ");
        String duration1 = scanner.nextLine();
        System.out.print("Enter course fee: ");
        double fee1 = scanner.nextDouble();
        scanner.nextLine();
        Course course1 = new Course(name1, duration1, fee1);
        course1.displayCourseDetails();
        // Update institute name using class method
        System.out.print("\nEnter new institute name to update: ");
        String newInstitute = scanner.nextLine();
        Course.updateInstituteName(newInstitute);
        System.out.print("\nEnter another course name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter course duration: ");
        String duration2 = scanner.nextLine();
        System.out.print("Enter course fee: ");
        double fee2 = scanner.nextDouble();
        Course course2 = new Course(name2, duration2, fee2);
        course2.displayCourseDetails();
    }
}
