package top301_400;

import java.util.ArrayList;
import java.util.Random;


public class randomPickIndex_4_398 {
	int[] myNum;
	public randomPickIndex_4_398(int[] nums){
		myNum = nums;
	}
	
	public int pick(int target){
		ArrayList<Integer> targetSet = new ArrayList<Integer>();
		for(int i =0; i < myNum.length;i++){
			if(myNum[i]==target){
				targetSet.add(i);
			}
		}
//		ArrayList<Integer> targetSet = coresIndex.get(target);
		int size = targetSet.size();
		int item = new Random().nextInt(size);
		int i = 0;
		int result = 0;
		for(Integer obj : targetSet){
			if(i == item)
				result = obj;
			i = i+1;
		}
		return result;
	}
}
