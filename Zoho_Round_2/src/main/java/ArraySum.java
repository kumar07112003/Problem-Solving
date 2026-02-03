package solving;

public class ArraySum {
	
	public static void main(String[] args) {
		
		int [] a= {9,9,9};
		int [] b= {1,0,1};
		
		String result="";
		int eachsum=0, last=0,first=0;
		for(int i=a.length-1;i>=0;i--)
		{
			eachsum+=a[i]+b[i]+first;
			
				last=eachsum%10;
				
				result+=last;
				first=eachsum/10;	
		}
		if(first>0)
		{
			result+=first;
		}
		
		System.out.println(result);
		String res="";
		
		char [] ch=result.toCharArray();
		
		for(int i=result.length()-1;i>=0;i--)
		{
			res+=ch[i];
		}
		System.out.println(res);
	}

}
