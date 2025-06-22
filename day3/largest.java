import java.util.*;
class largest{
public static void main(String... arg){
Scanner sc=new Scanner(System.in);
int number1=sc.nextInt();
int number2=sc.nextInt();
int number3=sc.nextInt();
if(number1>number2 && number1>number3)
System.out.print(" the first number "+number1+" the largest ");
else if(number2>number3 && number2>number1)
System.out.print(" the second number "+number2+" the largest ");
else
System.out.print(" the third number "+number3+" the largest ");
}
}