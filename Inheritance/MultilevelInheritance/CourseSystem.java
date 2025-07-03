import java.util.Scanner;

// Base class
class Course {
    String courseName;
    int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded Sessions: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // in percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee after Discount: ₹" + getFinalFee());
    }
}

// Main class
public class CourseSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter Course Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Duration (in weeks): ");
        int duration = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Platform Name: ");
        String platform = scanner.nextLine();

        System.out.print("Is the course recorded? (true/false): ");
        boolean isRecorded = scanner.nextBoolean();

        System.out.print("Enter Course Fee: ₹");
        double fee = scanner.nextDouble();

        System.out.print("Enter Discount (%): ");
        double discount = scanner.nextDouble();

        // Create and display course
        PaidOnlineCourse course = new PaidOnlineCourse(name, duration, platform, isRecorded, fee, discount);

        System.out.println("\n--- Course Details ---");
        course.displayDetails();

        scanner.close();
    }
}
