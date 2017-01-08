package top401_500;
/**
 * Problem No: 423
 * Description:Given a non-empty string containing an out-of-order English representation of digits 0-9, output the digits in ascending order.
 * Note:
 * Input contains only lowercase English letters.
 * Input is guaranteed to be valid and can be transformed to its original digits. 
 * That means invalid inputs such as "abc" or "zerone" are not permitted.
 * Input length is less than 50,000.
 */
import java.util.Collections;


public class reconstructOriginalDigitsfromEnglish_423 {
	public static String originalDigits(String s){
		String strResult ="";
		String uniChar2 = "znwhufxsgi";
		int[] result = new int[10];
		char[] sChar = s.toCharArray();
		for(char c : sChar){
			if(uniChar2.contains(String.valueOf(c))){
				int i = uniChar2.indexOf(c);
				result[i]=result[i]+1;
			}
		}	
		result[7]-=result[6];
		result[5]-=result[4];
		result[3]-=result[8];
		result[9]=result[9]-result[5]-result[6]-result[8];
		result[1] = result[1]-result[7]-2*result[9];
		
		for(int i = 0; i < 10; i++){
			strResult+=String.join("", Collections.nCopies(result[i], Integer.toString(i)));
		
		}
		return strResult;
	}
	
	public static void main(String[] args){
		System.out.println(originalDigits("owoztneoer"));
	}
}
