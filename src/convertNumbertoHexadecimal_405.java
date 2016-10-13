/**
 * Problem No: 405
 * Description: Given an integer, write an algorithm to convert it to hexadecimal. 
 * For negative integer, two’s complement method is used.
 * Note:
 * All letters in hexadecimal (a-f) must be in lowercase.
 * The hexadecimal string must not contain extra leading 0s.
 * If the number is zero, it is represented by a single zero character '0'; 
 * otherwise, the first character in the hexadecimal string will not be the zero character.
 * The given number is guaranteed to fit within the range of a 32-bit signed integer.
 * You must not use any method provided by the library which converts/formats the number to hex directly.
 * @author Zhaolian
 * References:
 * http://www.cnblogs.com/gaizai/p/4233780.html#_labelConvert30
 * http://stackoverflow.com/questions/1049722/what-is-2s-complement
 */
public class convertNumbertoHexadecimal_405 {
	public static String parseHex(int num){
		if(num<10)
			return Integer.toString(num);
		else{
			switch(num){
			case 10:
				return "a";
			case 11:
				return "b";
			case 12:
				return "c";
			case 13:
				return "d";
			case 14:
				return "e";
			case 15:
				return "f";
			default:
				return "";
			}
		}
	}
	public static String toHex(int num){
		String result = "";
		int rep = num;
		if(rep==0)
			return "0";
		if(rep!=0){
			while(rep!=0){
				int curr4Bits = rep&15;
				String repBits = Integer.toBinaryString(rep);  //toBinaryString have convert integer as two's complement
				System.out.println(repBits);
				rep = rep>>>4;
				result = parseHex(curr4Bits)+result;
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(toHex(-1));
		//System.out.println(-1>>>4);
	}
}
