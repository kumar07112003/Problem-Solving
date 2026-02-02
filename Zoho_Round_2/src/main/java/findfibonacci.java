package solving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findfibonacci {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		String [] s="10 8 4 2".split(" ");
		System.out.println("Enter the Number :");
//		String [] s=sc.nextLine().split(" ");
		List<Integer> list=new ArrayList<>();
		for(String a:s)
		{
			int num=Integer.parseInt(a);
			if(fib(num))
			{
				list.add(num);
			}
			
		}
		System.out.print("Finded Fibonacci :"+list);
	}
	
	public static boolean fib(int num)
	{
		int a=0,b=1;
		while(a<=num)
		{
			if(a==num)
			{
				return true;
			}
			int temp=a+b;
			a=b;
			b=temp;
		}
		return false;
	}

}
