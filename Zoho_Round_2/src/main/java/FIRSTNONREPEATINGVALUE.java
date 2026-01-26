package solving;


import java.util.Arrays;

public class FIRSTNONREPEATINGVALUE {
	
	public static void main(String[] args)
	{
		String s="swiss";
		int count=0;
		int max=0;
		char [] a=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==' ')
				continue;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=' ';
					a[j]=' ';
					count++;
				}
				
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=' ')
			{
				System.out.println("First Non Reapting Character Is : "+a[i]);
				break;
			}
		}
		
	}

}
