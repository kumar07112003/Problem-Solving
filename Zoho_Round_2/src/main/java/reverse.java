package test;

import java.util.Scanner;

public class reverse {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
		System.out.println(reverse(num));
	}
	
	public static int reverse(int num)
	{

	
		Integer rev=0;
		int intmax=1056389759;
		int min=Integer.MIN_VALUE;
		int max=Integer.MAX_VALUE;
		while(num > 0 || num < 0  )
		{
			
			int last = num%10;
			
			num=num/10; 	
		
		if(max/10< rev || rev == max/10 && last >7 )
			return 0;
		
		if(min/10>rev || min/10==rev  && last<-8)
			return 0;
		
		rev=rev*10+last;
		}
		return rev;
	}

}
