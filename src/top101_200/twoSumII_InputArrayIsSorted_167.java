package top101_200;

import java.util.Arrays;

public class twoSumII_InputArrayIsSorted_167 {
	
	public static int[] twoSum(int[] numbers,int target){
		int maxIndex = numbers.length;
		int[] result = new int[2];
		if(target!=0){
			for(int i = 0; i < numbers.length;i++){
				if(numbers[i]>=target){
				maxIndex = i;
				break;
				}
			}
		}
		for(int i = 0; i < maxIndex;i++){
			for(int j = i+1; j <maxIndex;j++){
				if((numbers[i]+numbers[j])==target){
					result[0]=i+1;
					result[1]=j+1;
					break;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {-3,3,4,90};
		int[] result = twoSum(numbers, 0);
		System.out.println(Arrays.toString(result));
	}

}
