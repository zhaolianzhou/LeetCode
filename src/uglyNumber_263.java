/**
 * Problem No: 263
 * Description:
 * Write a program to check whether a given number is an ugly number.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
 * Note that 1 is typically treated as an ugly number.
 * @author Zhaolian
 *
 */
public class uglyNumber_263 {
	public static boolean isUgly(int num){
		if(num <=0)
			return false;
		if(num == 1)
			return true;
		else if(num%2!=0&&num%3!=0&&num%5!=0){
			return false;
		}
		else{
			if(num%2 == 0)
				num = num/2;
			if(num%3 == 0)
				num = num/3;
			if(num%5 == 0)
				num = num/5;
			return isUgly(num);
		}
	}
	
	public static void main(String[] args){
		System.out.println(isUgly(17));
	}
}
