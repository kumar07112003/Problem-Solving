package solving;

import java.util.Scanner;

public class Twisted_prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(isprime(num) && isprime(reverse(num)))
		{
			System.out.println("IsTwistedprime");
		}
		else {
			System.out.println("NotAPrime");
		}
		
	}
	public static boolean isprime(int num)
	{
		if(num<2)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static int reverse(int num) {
		int rev=0;
		while(num>0)
		{
			int last=num%10;
			rev=rev*10+last;
			num=num/10;
		}
		return rev;
	}

}
