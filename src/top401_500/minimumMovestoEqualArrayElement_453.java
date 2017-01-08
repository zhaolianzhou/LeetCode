package top401_500;
import java.util.Arrays;
/**
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.
 * Example:
 * Input:
 * [1,2,3]
 * Output:3
 * Explanation:
 * Only three moves are needed (remember each move increments two elements):
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 * @author Zhaolian
 * Add 1 to n - 1 elements is the same as subtracting 1 from one element, w.r.t goal of making the elements in the array equal.
 * So, best way to do this is make all the elements in the array equal to the min element.
 * sum(array) - n * minimum
 */
public class minimumMovestoEqualArrayElement_453 {
	public int minMoves(int[] nums) {
		if(nums==null||nums.length==1)
			return 0;
		int count = 0;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length;i++){
        	count+=nums[i]-nums[0];
        }
        return count;
    }
	
	
}
