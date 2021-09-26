package top2001_2100;
public class gridGame_2017 {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long[] prefixSumTop = new long[n];
        long[] prefixSumBottom = new long[n];

        prefixSumTop[0] = grid[0][0];
        prefixSumBottom[0] = grid[1][0];

        for (int i =1; i < n; i++) {
            prefixSumTop[i] = grid[0][i] + prefixSumTop[i-1];
            prefixSumBottom[i] = grid[1][i] + prefixSumBottom[i-1];
        }
        long secondMax = Long.MAX_VALUE;
        for (int i=0; i < n-1; i++) {
            long top = prefixSumTop[n-1]-prefixSumTop[i];
            long bottom = 0;
            if (i>0) {
                bottom = prefixSumBottom[i-1];
            }
            long currentMax = Math.max(top, bottom);
            secondMax = Math.min(currentMax, secondMax);
            System.out.println(secondMax);
        }
        return secondMax;
    }

    public static void main(String[] args) {
        gridGame_2017 test = new gridGame_2017();
        int[][] testCase = {{2,5,4}, {1,5,1}};
        System.out.println(test.gridGame(testCase));
    }
}