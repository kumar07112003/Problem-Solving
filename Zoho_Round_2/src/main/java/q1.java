package solving;

import java.util.Stack;

public class q1 {
	
	public static void main(String[] args) {
		
		String input="(a+b)(a*b)";
		
		if(isvalid(input))
		{
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

	private static boolean isvalid(String input) {
		
		Stack <Character>  stack= new Stack<>();
		char prev=' ';
		
		for(int i=0;i<input.length();i++)
		{
			char ch= input.charAt(i);
			
			if(ch == '(')
			{
				stack.push(ch);
			}
			else if(ch == ')')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				stack.pop();
			}
			if(ch == '+' || ch =='-' || ch=='/' || ch=='*')
			{
				if(prev == ' ' || prev == '(' || prev == '+' || prev =='-' || prev=='/' || prev=='*')
				{
					return false;
				}
			}
			prev =ch;
		}
		
	 return stack.isEmpty() && ! ( prev == '+' || prev =='-' || prev=='/' || prev=='*');
	}

}
