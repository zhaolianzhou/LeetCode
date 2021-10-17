package top100;

public class jumpGame2_45 {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n==1)
            return 0;

        int[] stepArray = new int[n];
        for (int i = 0; i < n; i++) {
            int currentMinStep = stepArray[i];
            for (int j = 0; j <= nums[i] && j < n-i; j++) {
                int nexIndex = i + j;
                if (stepArray[nexIndex] != 0 )
                    stepArray[nexIndex] = Math.min(stepArray[nexIndex], currentMinStep+1);
                else
                    stepArray[nexIndex] = currentMinStep+1;
            }
        }
        return stepArray[n-1];
    }

    public static void main(String[] args) {
        int[] testCase = new int[]{2,3,1,1,4};
        jumpGame2_45 testClass = new jumpGame2_45();
        System.out.println(testClass.jump(testCase));
    }
}
