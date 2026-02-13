package solving;

import java.util.Arrays;

public class Find_Median_Sorted_Array {
	
	public static void main(String[] args) {
		int [] nums1= {1,2,3};
		int [] nums2= {4,5,6};
		
		System.out.println("Mediam_Sorted_Array : "+findMedianSortedArrays(nums1,nums2));
		
		
	}

	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


	        int [] merge= new int [nums1.length+nums2.length];
	        for(int i=0;i<nums1.length;i++)
	        {
	            merge[i]=nums1[i];
	        }
	        for(int i=0;i<nums2.length;i++)
	        {
	            merge[nums1.length+i]=nums2[i];
	        }
	        Arrays.sort(merge);
	        double result=0.0;
	        if(merge.length%2==0)
	        {
	            result= ((merge[merge.length/2-1]+merge[merge.length/2])/2.0);
	            return result;
	        }
	        else{
	            result =(merge[merge.length/2]);
	            return result;
	        }
	    }
}

   
