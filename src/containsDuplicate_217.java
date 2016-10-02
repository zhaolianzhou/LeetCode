import java.util.HashSet;
/**
 * Problem No : 217
 * Description:
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 * @author Zhaolian
 *
 */
public class containsDuplicate_217 {
	public boolean containDuplicate(int[] nums){
		HashSet<Integer> currNum = new HashSet<Integer>();
		for(int i : nums){
			if(currNum.contains(i))
				return true;
			else
				currNum.add(i);
		}
		return false;
	}
}
