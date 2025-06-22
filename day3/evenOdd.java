import java.util.*;
class evenOdd{
public static void main(String... arg){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=1;i<=n;i++){
if(i%2==0)
System.out.println("even no. is "+ i);
else
System.out.println("odd no. is "+ i);
}
}
}