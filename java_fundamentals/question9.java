import java.util.*;
public class question9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number-1: ");
		double a = sc.nextDouble();
		System.out.println("Enter number-2: ");
		double b = sc.nextDouble();
		System.out.println("Enter number-3: ");
		double c = sc.nextDouble();
		double result = (a + b + c) / 3;
		System.out.println(result);
	}
}