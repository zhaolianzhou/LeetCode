package top100;
/**
 * No: 70
 * Description: You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Tags: Dynamic Programming 
 * @author zhaolianzhou
 *
 */
public class climbingStairs_70 {
	
	public static int climbStairs(int n){
		if (n==2||n==1||n==0)
			return n;
		int[] mem= new int[n];
		mem[0]=1;
		mem[1]=2;
		for(int i=2; i< n; i++){
			mem[i]=mem[i-1]+mem[i-2];
		}
		return mem[n-1];
		
		/**
		 * My initial solution
		 */
		/**
		 * if (n==1||n=0)
		 * 		return 1;
		 * else
		 * 		return climbStairs(n-1)+(n-2);
		 */
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(44));
	}

}
