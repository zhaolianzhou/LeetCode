package top301_400;

public class rangeSumQuery_303 {
	private long[] sums=null;
	public rangeSumQuery_303(int[] nums){
		if(nums!=null&&nums.length!=0){
			int n = nums.length;
			sums = new long[n];
			sums[0]=nums[0];
			for(int i =1;i <n; i++){
				sums[i]=nums[i]+sums[i-1];
			}
		}
	}
	
	public int sumRange(int i, int j){
		if(i==0)
			return (int)sums[j];
		int sum =(int)(sums[j]-sums[i-1]);
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = null;
		rangeSumQuery_303 obj = new rangeSumQuery_303(nums);
	}

}
