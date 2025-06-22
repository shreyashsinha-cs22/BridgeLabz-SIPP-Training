import java.util.*;
class factorial{
public static void main(String... arg){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int factorial=1;
int i=1;
while(i<=n){
factorial*=i;
i++;
}

System.out.println("factorial of no. " + factorial);
}
}