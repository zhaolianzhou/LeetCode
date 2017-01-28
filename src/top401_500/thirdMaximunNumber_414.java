package top401_500;

public class thirdMaximunNumber_414 {
	public static int thirdMax(int[] nums){
		int n = nums.length;
		int first=nums[0], second=nums[0], third=nums[0];
		for(int i = 1; i <n;i++){
			if(nums[i]>first){
				third = second;
				second = first;
				first=nums[i];
			}
			if(nums[i]<first&&second==first){
				second = nums[i];
			}
			if(nums[i]<second&&third>=second){
				third = nums[i];
			}
			if(nums[i]<first&&nums[i]>second){
				third = second;
				second = nums[i];
			}
			if(nums[i]<second&&nums[i]>third){
				third = nums[i];
			}
			System.out.println("1:"+first);
			System.out.println("2:"+second);
			System.out.println("3:"+third);
		}
		if(second!=third)
			return third;
		else
			return first;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,5,3,5};
		thirdMax(nums);
	}

}
