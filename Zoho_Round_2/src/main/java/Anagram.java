package solving;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1="race";
		String s2="care";
		
		char [] ch=s1.toCharArray();
		char [] ch1=s2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		s1=new String(ch);
		s2=new String(ch1);
		
		if(s1.equals(s2))
		{
			System.out.println("Anagarm");
			
		}
		else {
			System.out.println("Not a Anagarm");
		}
		
	System.out.println(Arrays.toString(ch));
	System.err.println(Arrays.toString(ch1));
	
	
	
		
				
	}

}
