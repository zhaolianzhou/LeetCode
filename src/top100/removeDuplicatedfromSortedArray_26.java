package top100;

import java.util.Arrays;

public class removeDuplicatedfromSortedArray_26 {
	public static int removeDuplicates(int[] nums){
		int newLen = 1;
		if(nums==null||nums.length==0||nums.length==1)
			return nums.length;
		for(int i = 1, j = 0; i <nums.length; i++){
			if(nums[i]!=nums[j]){
				j++;
				nums[j]=nums[i];
				newLen++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return newLen;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,2,3};
		int length = removeDuplicates(nums);
		System.out.println(length);
	}

}
