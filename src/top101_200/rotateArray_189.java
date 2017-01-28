package top101_200;

import java.util.Arrays;

public class rotateArray_189 {
	public static void rotate(int[] nums, int k){
		int n = nums.length;
		int[] tem = new int[k];
		if(k==0||k%n==0)
			return;
		k=k%n;
		for(int i = n-k,j=0;i<n;i++,j++){
			tem[j]=nums[i];
		}
		for(int i = n-k-1; i >=0;i--){
			nums[i+k]=nums[i];
		}
		for(int i = 0; i <k;i++){
			nums[i]=tem[i];
		}
		System.out.println(Arrays.toString(nums));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3,4,5,6,7,8};
		rotate(nums,3);
	}

}
