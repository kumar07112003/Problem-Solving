package solving;

public class TrappingRainWater {
	
	public static void main(String[] args) {
		
		int [] a= {4,2,0,3,2,5};
		
		System.out.println("Trapping rain Water : "+trappingrainwater(a));
	}
	public static int trappingrainwater(int [] a)
	{
		int sum=0;
		int [] leftmax=new int [a.length];
		 leftmax[0]=a[0];
		for(int i=1;i<a.length;i++)
		{
			leftmax[i]=Math.max(a[i], leftmax[i-1]);
		}
		int [] rightmax=new int [a.length];
		rightmax[a.length-1]=a[a.length-1];
		for(int i=a.length-2;i>=0;i--)
		{
			rightmax[i]=Math.max(a[i], rightmax[i+1]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+Math.min(leftmax[i], rightmax[i])-a[i];
		}
		
		return  sum;
	}

}
