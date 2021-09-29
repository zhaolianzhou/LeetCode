package top1102_1200;

public class tribonacciNumber_1137 {
    public int tribonacci(int n) {
        if (n<2)
            return n;
        int[] memo = new int[3];
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 1;
        int sum = 1;
        for (int i =3; i <=n; i++) {
            sum = memo[0]+memo[1]+memo[2];
            memo[0] = memo[1];
            memo[1] = memo[2];
            memo[2] = sum;
        }
        return sum;
    }
}
