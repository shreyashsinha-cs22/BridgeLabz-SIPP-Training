import java.util.*;
public class question10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter kilometers: ");
		double kilometers = sc.nextDouble();
		double miles = kilometers * 0.621371;
		System.out.println(miles);
	}
}