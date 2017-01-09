import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Find All Numbers Disappeared in an Array
 * Note: in O(n) runtime and no extra space
 * @author zhaolianzhou
 *
 */
public class findNumbersDisappearedInArray_448 {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Arrays.sort(nums);
        int j=1;
        for(int i =0; i < nums.length;){
        	if(nums[i]==j){
        		i++;
        		j++;
        	}else if(nums[i]<j){
        		i++;
        	}else{
        		result.add(j);
        		j++;
        	}
        }
        while(j<=nums.length){
        	result.add(j);
        	j++;
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,1};
		List<Integer> result = findDisappearedNumbers(nums);
		System.out.println(result);
	}

}
