import java.util.Scanner;

class FootballPlayer{

	public static void main(String[] args) {
		// Taking the number input from the user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of players: ");
		
		double arr[]=new double[11];
		for(int i=0;i<11;i++)
		arr[i]=sc.nextDouble();
		double mean=0.0;
		for(int i=0;i<11;i++){
			mean+=arr[i];
		}
		mean=mean/11;
		System.out.println("mean height of players are "+mean	);
	}
}