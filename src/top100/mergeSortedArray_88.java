package top100;

import java.util.Arrays;

public class mergeSortedArray_88 {
	public static void merge(int[] nums1, int m, int[] nums2, int n){
		if(nums2==null)
			return;
		int curr_end = m+n-1;
		int end1 = m-1;
		int end2 = n-1;
		while(end1>=0&&end2>=0){
			if(nums2[end2]>=nums1[end1]){
				nums1[curr_end]=nums2[end2];
				end2--;
			}
			else{
				nums1[curr_end]=nums1[end1];
				end1--;
			}
			curr_end--;
		}
		if(end2>=0){
			while(end2>=0){
				nums1[curr_end]=nums2[end2];
				end2--;
				curr_end--;
			}
		}
		
		System.out.println(Arrays.toString(nums1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1=new int[10];
		int[] nums2=new int[3];
		nums1[0]=1;
		nums1[1]=3;
		nums1[2]=4;
		nums1[3]=7;
		nums2[0]=1;
		nums2[1]=2;
		nums2[2]=6;
		merge(nums1,4,nums2, 3);
	}

}
