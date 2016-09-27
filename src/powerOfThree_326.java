/**
 * No. 326
 * Problem Describe
 * Given an integer, write a function to determine if it is a power of three.
 * Follow up:
 * Could you do it without using any loop / recursion?
 * @author Zhaolian
 *
 */
public class powerOfThree_326 {
	public static boolean isPowerOfThree(int n){
		if(n <= 0)			
			return false;
		if(n == 1)
			return true;
		else if(n%3!=0)
			return false;
		else
			return isPowerOfThree(n/3);
		
		//Solution with out loop or recursion
		// 1162261467 is 3^19,  3^20 is bigger than int 
		//return (n>0 && 1162261467%n ==0);
	}
	public static void main(String[] args){
		
	}
}
