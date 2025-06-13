import java.util.*;
public class question7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int length = sc.nextInt();
		System.out.println("Enter width: ");
		int width = sc.nextInt();
		int Perimeter = 2 * (length + width);
		System.out.println(Perimeter);
	}
}