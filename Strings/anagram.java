import java.util.*;
class anagram{
	public static void main(String... arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string 1");
		String s=sc.nextLine();
		System.out.println("enter string 2");
		String s1=sc.nextLine();
		int c=0;
		if(s1.length() != s.length())
			System.out.println("not anaram");
		else{
			Map<Character,Integer> mp=new HashMap<>();
			Map<Character,Integer> mp1=new HashMap<>();
			for(int i=0;i<s.length();i++){
				if(mp.containsKey(s.charAt(i))){
					mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
				}
				else
					mp.put(s.charAt(i),1);
			}
			for(int i=0;i<s1.length();i++){
				if(mp1.containsKey(s1.charAt(i))){
					mp1.put(s1.charAt(i),mp1.get(s1.charAt(i))+1);
				}
				else
					mp1.put(s1.charAt(i),1);
			}
			if(mp.equals(mp1))
				System.out.println("anagram string");
			else
				System.out.println("not anaram");
		}
	}
}