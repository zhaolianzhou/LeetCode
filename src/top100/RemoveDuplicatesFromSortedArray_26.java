import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int len = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[len] != nums[i]) {
                len++;
                nums[len] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return len+1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray_26 instance = new RemoveDuplicatesFromSortedArray_26();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(instance.removeDuplicates(nums));
    }
}
