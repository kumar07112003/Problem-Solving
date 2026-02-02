package solving;

public class equilibrium_TwoPointer {
	
	public static void main(String[] args) {
		
		
		
				int [] a= {1,2,3,7,6};
				
				int left=0,right=a.length-1;
				int leftsum=0,rightsum=0;
				
				while(left<right)
				{
					if(leftsum<=rightsum)
					{
						leftsum+=a[left];
						left++;
						
					}
					else {
						rightsum+=a[right];
						right--;
					}
					if(a[left]==a[right])
					{
						System.out.println(a[left]);
						return;
					
					}
					
						
				}
			}
		

}
