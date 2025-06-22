import java.util.*;
class check_pos_neg_0{
public static void main(String... arg){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
if(number>0)
System.out.print(" Positive number. ");
else if(number<0)
System.out.print(" Negative number. ");
else
System.out.print("Zero");

}
}