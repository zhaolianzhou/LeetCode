package top100;

import java.util.Arrays;

public class removeElement_27 {
	public static int removeElement(int[] nums, int val){
		int length = 0;
		if(nums==null)
			return 0;
		for(int curr_end = 0, next = 0; next<nums.length;next++){
			if(nums[next]!=val){
				nums[curr_end]=nums[next];
				curr_end++;
			}
			else
				length++;
		}
		System.out.println(Arrays.toString(nums));
		return nums.length-length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={3,4,5,2,3};
		System.out.println(removeElement(nums, 3));
	}

}
