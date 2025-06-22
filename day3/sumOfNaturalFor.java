import java.util.*;
class sumOfNatural{
public static void main(String... arg){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n<1)
System.out.println("The number is not a natural number");
int loopsum=0;
for(int i=n;i>0;i--){
loopsum+=i;
}
int formulasum=((n+1)*n)/2;
if(loopsum==formulasum)
System.out.println("Sum using while loop: " + loopsum);
else
System.out.println("Sum using formula: " + formulasum);
}
}