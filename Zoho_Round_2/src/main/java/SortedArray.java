package solving;

import java.util.Arrays;

public class SortedArray {
	
	public static void main(String[] args) {
		
		int [] a= {8,2,3,12,16};
		
		
		int left=0;
		
		
		while(left < a.length-1)
		{
			int maxi=left;
			int right=left+1;  
			while(right<a.length)
			{
				if(a[right]>a[maxi])
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
		System.out.println(Arrays.toString(a));
	}

}
