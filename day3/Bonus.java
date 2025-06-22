import java.util.*;
class Bonus{
public static void main(String... arg){
Scanner sc=new Scanner(System.in);
int salary=sc.nextInt();
int year=sc.nextInt();
int bonus=(salary*5)/100;
if(year>5)
System.out.println("Bonus amount "+ (bonus+salary));
else
System.out.println("no bonus ");

}
}