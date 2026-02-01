package solving;

public class smallestandlargestsubstringbetweenvalues {

	public static void main(String[] args) {

		String s1 = "ZOHOCORPORATION";
		
		
		System.out.println(s1.length());

		String s2 = "PORT";

		char[] c1 = s1.toCharArray();

		char[] c2 = s2.toCharArray();

		int smallestindex = Integer.MAX_VALUE;
		;
	

		int largestindex = Integer.MIN_VALUE;
		
		for (int i = 0; i < c2.length; i++) {
			for (int j = 0; j < c1.length; j++) {
				if (c1[j] == c2[i]) {
					
					if (j > largestindex) {
						largestindex =j;
					}

					if (j < smallestindex) {
						smallestindex =j;
					}	
				}

				

			}
		}
		char[] res=new char[largestindex-smallestindex];
		int m=0;
		for(int i=smallestindex;i<largestindex-1;i++)
		{
			res[m++]=c1[i];
		}

		System.out.println(res);
		System.out.println(smallestindex);
		System.out.println("Max :" + largestindex);
	}

}
