import java.util.HashSet;
import java.util.Iterator;
/**
 * Problem No: 136
 * Description:
 * Given an array of integers, every element appears twice except for one. 
 * Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. 
 * Could you implement it without using extra memory?
 * @author Zhaolian
 * Tags: hash table, bit manipulation
 */
public class singleNumber_136 {
	public int singleNumber(int[] nums){
		HashSet<Integer> currNums = new HashSet<Integer>();
		for(int i : nums){
			if(currNums.contains(i)){
			
				currNums.remove(i);
			}
			else
				currNums.add(i);
		}
		Iterator<Integer> i = currNums.iterator();
		int result = i.next();
		return result;
	}
	/**
	 * Other solution busing bit manipulation
	 * public int singleNumber(int[] nums){
	 * if(nums == null){
	 * 		return -1;
	 * 	}
	 * int result  = 0;
	 * for(int n: nums){
	 * 		result = result ^ n;
	 * 	}
	 * 	return result;
	 * }
	 */
}
