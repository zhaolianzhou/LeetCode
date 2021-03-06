package top401_500;

/**
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.Example 1:
 * Input: "abab"
 * Output: True
 * Explanation: It's the substring "ab" twice.
 * Example 2:
 * Input: "aba"
 * Output: False
 * Example 3:
 * Input: "abcabcabcabc"
 * Output: True
 * Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 * @author Zhaolian
 *
 */
public class repeatedSubstring_459 {
	public boolean repeatedSubstringPattern(String str) {
		int len = str.length();
		for(int i = len/2; i >= 1; i--){
			if(len%i==0){
				int repeatTime = len/i;
				String sub  = str.substring(0, i);
				int j = 0;
				for(j = 1; j < repeatTime; j++){
					if(!sub.equals(str.substring(j*i, i*(j+1))))
							break;	
				}
				if(j==repeatTime)
					return true;
			}
		}
		return false;
    }
}
