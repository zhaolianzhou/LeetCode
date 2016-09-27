import java.util.ArrayList;
import java.util.HashSet;

/**
 * No 202
 * Problem Description
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process: 
 * Starting with any positive integer, 
 * replace the number by the sum of the squares of its digits, 
 * and repeat the process until the number equals 1 (where it will stay), 
 * or it loops endlessly in a cycle which does not include 1. 
 * Those numbers for which this process ends in 1 are happy numbers.
 * @author Zhaolian
 *
 */
public class happyNumber_202 {
	public static boolean isHappy(int n){
		if(n<=0)
			return false;
		if(n==1)
			return true;
	
		HashSet<Integer> resultSet = new HashSet<Integer>();
		ArrayList<Integer> currDigits = getNumDigits(n);
		int currResult = calSumOfPower(currDigits);
		while(currResult!=1){
			System.out.println(currResult);
			if(resultSet.contains(currResult))
				return false;
			resultSet.add(currResult);
			currDigits = getNumDigits(currResult);
			currResult =  calSumOfPower(currDigits);
		}
		return true;
		
	}
	
	public static ArrayList<Integer> getNumDigits(int n){
		int tem = n;
		ArrayList<Integer> numDigits = new ArrayList<Integer>();
		while(tem > 0){
			numDigits.add(tem%10);
			tem/=10;
		}
		return numDigits;
	}
	public static int calSumOfPower(ArrayList<Integer> numDigits){
		int result = 0;
		for(Integer digit : numDigits)
			result += digit*digit;
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(isHappy(7));
	}
}
