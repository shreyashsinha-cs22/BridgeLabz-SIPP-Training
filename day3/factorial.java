import java.util.*;
class factorial{
public static void main(String... arg){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n==0)
System.out.println(1);
int factorial=1;
for(int i=1;i<=n;i++){
factorial*=i;
}

System.out.println("factorial of no. " + factorial);
}
}