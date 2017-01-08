package top201_300;
import java.util.Arrays;

/**
 * No 242
 * Description:
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 * @author Zhaolian
 *
 */
public class validAnagram_242 {
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length())
			return false;
		if(s.equals("")&&t.equals(""))
			return true;
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		if(Arrays.equals(sArray, tArray))
			return true;
		else
			return false;
    }
	public static void main(String[] args){
		boolean index = isAnagram("a","a");
		System.out.println(index);
	}
}
