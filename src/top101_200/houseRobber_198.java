package top101_200;

public class houseRobber_198 {
    public int rob(int[] nums) {
        int size = nums.length;
        if (size==1)
            return nums[0];
        if (size == 2)
            return Math.max(nums[0], nums[1]);

        int[] currentNumber = new int[2];
        currentNumber[0] = nums[0];
        currentNumber[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            int current = Math.max(nums[i] + currentNumber[0], currentNumber[1]);
            currentNumber[0] = currentNumber[1];
            currentNumber[1] = current;
        }
        return Math.max(currentNumber[0], currentNumber[1]);
    }
}
