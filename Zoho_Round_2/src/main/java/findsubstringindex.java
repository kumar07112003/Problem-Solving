package solving;

public class findsubstringindex {
	
	public static void main(String[] args) {
		
		String s1="test123string";
		String s2="123";
		char [] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		for(int i=0;i<c1.length-c2.length;i++)
		{
			int j;
			for(j=0;j<c2.length;j++)
			{
				if(c1[i+j]!=c2[j])
				{
					
					break;
				}	
				
			
			}
			if(j==c2.length)
			{
				System.out.println("first index of substring in string1 is :"+i);
			}
		}
	}

}
