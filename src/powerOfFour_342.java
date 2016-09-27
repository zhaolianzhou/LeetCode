/**
 * No 342
 * Problem Description
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 * Follow up: Could you solve it without loops/recursion?
 * @author Zhaolian
 *
 */
public class powerOfFour_342 {
	public static boolean isPowerOfFour(int n){
		if(n <= 0)			
			return false;
		if(n == 1)
			return true;
		else if(n%4!=0)
			return false;
		else
			return isPowerOfFour(n/4);
	}
}
