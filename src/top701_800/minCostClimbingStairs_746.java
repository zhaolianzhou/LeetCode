package top701_800;

public class minCostClimbingStairs_746 {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length==2)
            return Math.min(cost[0], cost[1]);
        int[] pastTwoStep = new int[2];
        pastTwoStep[0] = cost[0];
        pastTwoStep[1] = cost[1];
        int currentCost = 0;
        for (int i=2; i < cost.length; i++) {
            currentCost = cost[i] + Math.min(pastTwoStep[0], pastTwoStep[1]);
            pastTwoStep[0] = pastTwoStep[1];
            pastTwoStep[1] = currentCost;
        }
        return Math.min(pastTwoStep[0], pastTwoStep[1]);
    }
}
