package top100;

public class MaximumSubarray_53 {
	public static int maxSubArray(int[] nums){
		if(nums==null||nums.length==0)
			return (Integer)null;
		int n = nums.length;
		int[] sumList = new int[n];
		sumList[0]=nums[0];
		int maxSum = sumList[0];
		int curr_max = sumList[0];
		for(int i = 1; i < n; i++){
			curr_max = Math.max(nums[i], curr_max+nums[i]);
			if(curr_max>maxSum)
				maxSum=curr_max;
		}
		return maxSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,-1};
		System.out.println(maxSubArray(nums));
	}

}
