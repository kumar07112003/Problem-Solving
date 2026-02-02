package solving;

import java.util.Arrays;
import java.util.Scanner;

public class findtheseondlargestNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] a= {2,5,3,6,4};
		
		int left=0;
		
		
		while(left<a.length-1)
		{
			int maxi=left;
			int right=left+1;
		   while(right<a.length)
		   {
			   if(a[right]<a[maxi])
			   {
				   maxi=right;
				   
			   }
			   right++;
		   }
		   int temp=a[left];
		   a[left]=a[maxi];
		   a[maxi]=temp;
		   left++;
			
		}
		System.out.println("Enter the nthLargest Number :" );
		int num=sc.nextInt();
		int nthlargest=a[a.length-num];
		System.out.println("Nth largest elements is :"+nthlargest);
		System.out.println(Arrays.toString(a));
	}

}
