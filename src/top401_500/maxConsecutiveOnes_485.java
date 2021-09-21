package top401_500;

public class maxConsecutiveOnes_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (count>maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        if (count>maxCount) {
            maxCount = count;
        }
        return maxCount;
    }
}
