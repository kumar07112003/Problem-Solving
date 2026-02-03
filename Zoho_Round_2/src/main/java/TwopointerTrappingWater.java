package solving;

public class TwopointerTrappingWater {
	
	public static void main(String[] args) {
		
		int[] a = {5, 2, 0, 3, 2, 1};

		System.out.println(trapping(a));
	}

	private static int trapping(int[] a) {
		int water=0;
		int left=0,right=a.length-1;
		
		int leftmax=0,rightmax=0;
		
		while(left<right)
		{
			if(a[left]<=a[right])
			{
				if(a[left]>=leftmax)
					leftmax=a[left];
				else
					water=water+leftmax-a[left];
				
				left++;
			}
			else
			{
				if(a[right]>=rightmax)
					rightmax=a[right];
				else
					water=water+rightmax-a[right];
				
				right--;
				
			}
		}
		return water;
	}

}
