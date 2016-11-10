
import java.util.HashMap;
/**
 * No 169
 * Given an array of size n, find the majority element. The majority element is the element that appears more than [n/2] times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * @author Zhaolian
 *
 */
public class majorityElement_169 {
	public int majorityElement(int[] nums){
		int majorsize = nums.length/2;
		HashMap<Integer, Integer> elementCount = new HashMap<Integer, Integer>();
		for(int i: nums){
			if(!elementCount.containsKey(i)){
				elementCount.put(i, 1);
			}
			else{
				int currCount = elementCount.get(i)+1;
				elementCount.put(i, currCount);
			}
		}
		for(int item: elementCount.keySet()){
			if(elementCount.get(item)>=majorsize)
				return item;
		}
		return -1;
		
	}
}
