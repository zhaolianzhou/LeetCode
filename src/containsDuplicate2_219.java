import java.util.HashMap;

/**
 * Problem No: 219
 * Description:
 * Given an array of integers and an integer k, 
 * find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] 
 * and the difference between i and j is at most k.
 * @author Zhaolian
 *
 */
public class containsDuplicate2_219 {
	public static boolean containsNearbyDuplicate(int[] nums, int k){
		if(nums.length==0||nums == null)
			return false;
		HashMap<Integer, Integer> currNums = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++){
			if(currNums.containsKey(nums[i])){
				if(Math.abs(currNums.get(nums[i])-i)<=k)
					return true;
				else
					currNums.put(nums[i], i);
			}
			else
				currNums.put(nums[i],i);
		}
		return false;
	}
	
	public static void main(String[] args){
		int[] nums = {99,99};
		System.out.println(containsNearbyDuplicate(nums, 2));
	}
}
