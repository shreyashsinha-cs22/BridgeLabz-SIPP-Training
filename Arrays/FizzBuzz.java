import java.util.Scanner;

class FizzBuzz {

	public static void main(String[] args) {
		// Taking the number input from the user 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=input.nextInt();
	String str[]=new String[n];
		for(int i=0;i<n;i++){
		if(arr[i] > 0) {
				if((arr[i] % 3 == 0) && (arr[i] % 5 == 0)) {
					str[i]="FizzBuzz";
				} else if(arr[i] % 3 == 0) {
					str[i]="Fizz";
				} else if(arr[i] % 5 == 0) {
					str[i]="Buzz";
				} else {
					str[i]="i";
				}
			}
		}
		for(int i=0;i<str.length;i++)
			System.out.println("postion "+i+" "+str[i]);

	}
}
