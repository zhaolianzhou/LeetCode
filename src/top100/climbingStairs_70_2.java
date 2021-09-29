package top100;

public class climbingStairs_70_2 {
    public int climbStairs(int n) {
        if (n<=2)
            return n;
        int[] pastTwoStep = new int[2];
        pastTwoStep[0] = 1;
        pastTwoStep[1] = 2;
        int current = 0;
        for (int i = 3; i <= n; i++) {
            current = pastTwoStep[0] + pastTwoStep[1];
            pastTwoStep[0] = pastTwoStep[1];
            pastTwoStep[1] =current;
        }
        return current;
    }
}
