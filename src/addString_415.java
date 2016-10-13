import java.util.ArrayList;

/**
 * Problem No: 415
 * Desctiption: Given two non-negative numbers num1 and num2 represented as string,
 *  return the sum of num1 and num2.
 * Note:
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.       
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.  
 * @author Zhaolian
 *
 */
public class addString_415 {
	public static String addStrings(String num1, String num2){
		char[] num1List, num2List;
		if(num1.length()>num2.length()){
			num1List= num1.toCharArray();
			num2List= num2.toCharArray();
		}else{
			num1List= num2.toCharArray();
			num2List= num1.toCharArray();
		}
		ArrayList<Integer> sum = new ArrayList<Integer>();
		String result = "";
		int len1 = num1List.length-1;    //len1 >= len2
		int len2 = num2List.length-1;
		while(len2 >=0){
			int temSum = num1List[len1]+num2List[len2]-'0'*2;
			sum.add(0, temSum);
			len2--;
			len1--;
		}
		while(len1>=0){
			sum.add(0, (int)(num1List[len1]-'0'));
			len1--;	
		}
		int carry = 0;
		for(int i = sum.size()-1; i >=0;i--){
			int currBit = sum.get(i);
			if(carry != 0){
				currBit+=carry;
				carry=0;
			}
			if(currBit>=10){
				carry = currBit/10;
				currBit = currBit%10;	
			}
			sum.set(i, currBit);
			result = Integer.toString(currBit)+result;
		}
		if(carry!=0){
			sum.add(0, carry);
			result = Integer.toString(carry)+result;
		}
		return result;
	}
	
	public static void main(String args[]){
		String num1 = "123456789";
		String num2 = "7654321";
		System.out.println(addStrings(num1,num2));
	}
}
