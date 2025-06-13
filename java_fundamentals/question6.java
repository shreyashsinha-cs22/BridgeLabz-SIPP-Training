import java.util.*;
public class question6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal: ");
		int Principal = sc.nextInt();
		System.out.println("Enter Rate: ");
		int Rate = sc.nextInt();
		System.out.println("Enter Time: ");
		int Time = sc.nextInt();
		double SimpleInterest = (Principal * Rate * Time) / 100;
		System.out.println(SimpleInterest);
	}
}