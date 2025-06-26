import java.util.*;
class Patient {
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;
    private String name;
    private int age;
    private String ailment;
    private final String patientID;
    // Constructor
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
    // Static method to return total number of patients
    public static void getTotalPatients() {
        System.out.println("\nTotal Patients Admitted: " + totalPatients);
    }
    // Method to display patient details with instanceof check
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("\n--- Patient Details ---");
            System.out.println("Hospital Name : " + hospitalName);
            System.out.println("Patient ID    : " + patientID);
            System.out.println("Name          : " + name);
            System.out.println("Age           : " + age);
            System.out.println("Ailment       : " + ailment);
        } else {
            System.out.println("Invalid Patient Object.");
        }
    }
}

class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter age: ");
        int age1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter ailment: ");
        String ailment1 = sc.nextLine();
        System.out.print("Enter patient ID: ");
        String id1 = sc.nextLine();
        Patient p1 = new Patient(name1, age1, ailment1, id1);
        p1.displayPatientDetails();
        Patient.getTotalPatients();
    }
}
