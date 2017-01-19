package top100;

import java.util.ArrayList;
import java.util.Arrays;

public class plusOne_66 {
	public static int[] plusOne(int[] digits){
		if(digits[0]==0)
			return new int[]{1};
		for(int i = digits.length-1;i>=0;i--){
			if(digits[i]<9){
				digits[i]+=1;
				break;
			}else{
				digits[i]=0;
			}
		}
		if(digits[0]==0){
			int[] result = new int[digits.length+1];
			System.arraycopy(digits, 0, result, 1, digits.length);
			result[0]=1;
			return result;
		}
		else
			return digits;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1};
		int[] result = plusOne(nums);
		System.out.println(Arrays.toString(result));
	}

}
