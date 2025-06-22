import java.util.*;
class Check_number{
public static void main(String... arg){
Scanner sc=new Scanner(System.in);
int n=5;
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
for(int i=0;i<n;i++){
	if(arr[i]==0)
		System.out.println("Zero numbers: "+arr[i]);
	else if(arr[i]>0){
		if(arr[i]%2==0)
			System.out.println("Positive even numbers: "+arr[i]);
		else
			System.out.println("Positive odd numbers: "+arr[i]);
	}
	else
		System.out.println("negative numbers: "+arr[i]);
	}
	if(arr[0]>arr[4])
		System.out.println("first element is greater ");
	else if(arr[0]<arr[4])
		System.out.println("last element is greater ");
	else
		System.out.println("both are equal ");
}
}