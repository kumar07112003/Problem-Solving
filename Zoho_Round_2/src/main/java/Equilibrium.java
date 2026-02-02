package solving;

public class Equilibrium {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,7,6};
		int totalsum=0;
		
		for(int num:a)
		{
			totalsum+=num;
		}
		
		int rightsum=0,leftsum=0;
		for(int i=0;i<a.length;i++)
		{
			rightsum=totalsum-a[i]-leftsum;
			
			if(rightsum==leftsum)
			{
				System.out.println("Equilibrium :"+a[i]);
				System.out.println("Equilibrium index :"+i);
				return;
			}
			leftsum+=a[i];
		}
	}
}
