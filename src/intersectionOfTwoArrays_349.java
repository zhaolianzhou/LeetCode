import java.util.HashSet;

/**
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 * @author Zhaolian
 *
 */
public class intersectionOfTwoArrays_349 {
	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> result = new HashSet<Integer>();
        for(int i : nums1){
        	set1.add(i);
        }
        
        for(int j : nums2){
        	if(set1.contains(j))
        		result.add(j);
        }
        int[] finalResult = new int[result.size()];
        int i = 0;
        for(int item:result){
        	finalResult[i]=(int)item;
        	i++;
        }
        return finalResult;
    }
}
