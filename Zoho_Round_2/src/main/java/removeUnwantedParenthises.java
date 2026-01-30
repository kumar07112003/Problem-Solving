
package solving;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class removeUnwantedParenthises {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the value :");
		String s = sc.nextLine();
		System.out.println("Balance Expersion" + removeUnwantedParenthise(s));

	}

	public static  String removeUnwantedParenthise(String s) {
		
		Stack<Integer> stack = new Stack<>();
		Set<Integer>  removei=new HashSet<>();
		for(int i=0;i<s.length();i++)
	{
			char ch1=s.charAt(i);
			if(ch1 == '(')
			{
				
				stack.push(i);
				System.out.println(stack);
			}
			else if(ch1 ==')')
			{
				if(stack.isEmpty())
				{
					removei.add(i);
				}
				else {
					stack.pop();
					System.out.println(stack);

				}
			}
		}
		while(!stack.isEmpty())
		{
			removei.add(stack.pop());
			System.out.println("romove :"+removei);
		}
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<s.length();i++)
		{
			if(!removei.contains(i))
			{
				result.append(s.charAt(i));
			}
		}
		
	  return result.toString();  
	}


}
