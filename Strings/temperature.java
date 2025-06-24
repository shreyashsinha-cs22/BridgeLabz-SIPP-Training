import java.util.*;
class temperature{
	public static void main(String... arg){
		Scanner sc=new Scanner(System.in);
		float temp[][]=new float[3][3];
		float max=0,min=Float.MAX_VALUE;
		for(int i=0;i<temp.length;i++){
			for(int j=0;j<temp[i].length;j++){
				System.out.println("enter day "+(i+1)+" hour "+j +" temperature");
				temp[i][j]=sc.nextFloat();
				max=Math.max(max,temp[i][j]);
				min=Math.min(min,temp[i][j]);
			}
			System.out.println("highest temperature of day "+max);
			System.out.println("lowest temperature of day "+min);
		}
		System.out.println("Max temperature is "+max);
		System.out.println("Min temperature is "+min);
		float avg=0.0f;
		for(int i=0;i<7;i++){
			for(int j=0;i<24;j++){
				avg+=temp[i][j];
			}
			System.out.println("average temperature of day "+(avg/24.0));
		}
		
	}
}