package top100;

import javax.swing.text.html.parser.Entity;
import java.lang.reflect.Array;
import java.util.*;

public class threesum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length<3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        System.out.println(nums.toString());
        Set<List<Integer>> result = new HashSet<>();
        for (int i =0; i < nums.length-2; i++) {
            int j = i+1;
            int k = nums.length-1;
            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum > 0) k--;
                else j++;
            }
        }
        return new ArrayList(result);
    }

    public static void main(String[] args) {
        threesum_15 test = new threesum_15();
        int[] testCase = {-1,0,1,2,-1,-4};
        System.out.println(test.threeSum(testCase));
    }
}
