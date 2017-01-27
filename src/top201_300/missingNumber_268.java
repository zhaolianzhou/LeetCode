package top201_300;

import java.util.ArrayList;

public class missingNumber_268 {
	public static int missingNumber(int[] nums){
		int n=nums.length;
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		for(int i=0; i<=n;i++){
			nums2.add(i);
		}
		
		for(int i=0; i < n;i++){
			if(nums2.contains(nums[i])){
				System.out.println(nums[i]);
				nums2.remove(Integer.valueOf(nums[i]));
			}
		}
		return nums2.get(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0};
		System.out.println(missingNumber(nums));
	}

}
