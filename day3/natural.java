import java.util.*;
class natural{
static String check(int n){
if(n<1)
return " The number "+n+" is not a natural number ";
int x =n*(n+1)/2;
return " The sum of "+n+" natural numbers is "+x;
}
public static void main(String... arg){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

System.out.print(check(n));

}
}