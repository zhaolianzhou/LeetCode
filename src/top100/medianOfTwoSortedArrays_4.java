package top100;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class medianOfTwoSortedArrays_4 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int size1 = nums1.length;
       int size2 = nums2.length;
       int totalSize = size1+size2;
       int[] total = new int[totalSize];
//       System.arraycopy(nums1, 0, total, 0, size1);
//       System.arraycopy(nums2, 0, total, size1, size2);
//       Arrays.sort(total);
       int i = 0, j = 0,curr = 0;
       while(i<size1&&j<size2){
    	   if(nums1[i]<=nums2[j]){
    		   total[curr++]=nums1[i++];
    	   }else
    		   total[curr++]=nums2[j++];
       }
       while(i < size1)
    	   total[curr++]=nums1[i++];
       while(j < size2)
    	   total[curr++]=nums2[j++];
       if(totalSize%2==0){
    	   return (total[totalSize/2-1]+total[totalSize/2])/2.0;
       }
       else
    	   return total[totalSize/2];
        
    }
	
	public static void main(String[] args){
		int[] nums1 = {1,2};
		int[] nums2 = {3};
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
}
