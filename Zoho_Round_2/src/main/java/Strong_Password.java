package solving;

import java.util.Scanner;

public class Strong_Password {
	 public static  int rule=0;
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("ENter the Password :" );
		String s= sc.next();
		
		System.out.println(isPassword(s));
	}
	private static String isPassword(	String s)
	{
		
		boolean uppercase=false,lowercase=false,numbers=false,spechar=false;
		
		if(s.length()<8)
		{
			return "minimum 8 characters";
		}
		else if(s.length()>16)
		{
			return "maxmimum 16 characters";
		}
		
		char [] pch=s.toCharArray();
		for(char ch : pch)
		{
			if(islowercase(ch))
			{
				lowercase = true;
			}
			else if(isUppercase(ch))
			{
				uppercase=true;
			}
			else if(isNumber(ch))
			{
				numbers=true;
			}
			else if(isspecailCharacter(ch))
			{
				spechar=true;
			}
		}
		
		if(lowercase)
			rule++;
		if(uppercase)
			rule++;
		if(spechar)
			rule++;
		if(numbers)
			rule++;
		
		if( rule == 0 || rule == 1)
			return "Weak";
		else if(rule ==2)
			return "Medium";
		else if(rule == 3)
			return "Good";
		else
			return "Strong";
		
		
		
	}
	private static boolean isspecailCharacter(char ch) {
		String s1="!@#$%^&*()_+";
		for(char ch1 : s1.toCharArray())
		{

			if(ch ==  ch1)
			{
				return true;
			}
			
		}
		return false;
	}
	private static boolean isNumber(char ch) {
		if(ch>='1' && ch<='9')
		{
			return true;
		}
			
		return false;
	}
	
	private static boolean isUppercase(char ch) {
		
		if(ch >='A' && ch <='Z')
		{
		return true;
		}
		return false;
	}
	private static boolean islowercase(char ch) {
		
		
		if(ch >='a'  && ch <='z')
		{
			return true;
		}
		return false;
	}

}
