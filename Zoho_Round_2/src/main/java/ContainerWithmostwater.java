package solving;

public class ContainerWithmostwater {
	
	public static void main(String[] args) {
		
		int [] a= {1,8,6,2,5,4,8,3,7};
		System.out.println("Most water in Container is :"+ mostwatercontainer(a));
	}
	public static int mostwatercontainer(int [] a)
	{
		int max_area=0;
		int l=0;
		int right=a.length-1;
		
		while(l<right)
		{
			int length=Math.min(a[l], a[right]);
			
			int width=right-l;
			
			int area=length*width;
			
			max_area=Math.max(max_area,area);
			
			if(a[l]<a[right])
			{
				l++;
			}
			else
				right--;
			
		}
		
		return max_area;
	}

}
