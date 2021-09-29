package GetOffer;

public class duplicateNumberInArray_03 {
    public int findRepeatNumber(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1])
                return nums[i];
            else if (nums[i]> nums[i+1]) {
                for (int j = i+1; j > 0; j--) {
                    if (nums[j] < nums[j-1]) {
                        int tem = nums[j];
                        nums[j] = nums[j-1];
                        nums[j-1] = tem;
                    } else if (nums[j]==nums[j-1])
                        return nums[j];
                    else
                        break;;
                }
            }
        }
        return nums[nums.length-1];
    }
}
