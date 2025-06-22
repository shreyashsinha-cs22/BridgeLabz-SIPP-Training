import java.util.*;
class SpringSeason{
public static void main(String... arg){
Scanner sc=new Scanner(System.in);
int month=sc.nextInt();
int day=sc.nextInt();
if(month>=3 && month<=6 && day<=20)
System.out.print(" Its a Spring Season. ");
else
System.out.print(" Not a Spring Season. ");

}
}