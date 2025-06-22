
import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {
		// Taking input from the user 
		Scanner input = new Scanner(System.in);
		int[] ageOfStudents = new int[10];
		System.out.println("Enter the age of 10 students: ");
		for(int i = 0; i < ageOfStudents.length; i++) {
			ageOfStudents[i] = input.nextInt();
		}
		// Validation of voting age
		for(int i = 0; i < ageOfStudents.length; i++) {
			if(ageOfStudents[i] < 0) {
				System.out.println("Invalid age: " + ageOfStudents[i]);
			} else if(ageOfStudents[i] >= 18) {
				System.out.println("The student with the age " + ageOfStudents[i] + " can vote.");
			} else {
				System.out.println("The student with the age " + ageOfStudents[i] + " cannot vote.");
			}
		}
		

	}

}