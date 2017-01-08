package top401_500;
import java.util.HashMap;

/**
 * No 409
 * Description:
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * Example:
 * Input: "abccccdd"
 * Output:7
 * Explanation:One longest palindrome that can be built is "dccaccd", whose length is 7.
 * @author Zhaolian
 *
 */
public class longestPalindrome_409 {
	public int longestPalindrome(String s) {
        char[] sArray = s.toCharArray();
        int result =0;
        int singleCount = 0;
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        for(char sc : sArray){
        	if(sMap.containsKey(sc)){
        		int value = sMap.get(sc)+1;
        		sMap.put(sc, value);
        	}else
        		sMap.put(sc,1);
        }
        for(Character c : sMap.keySet()){
        	if(sMap.get(c)%2==0)
        		result+=sMap.get(c);
        	else{
        		result+=sMap.get(c)-1;
        		singleCount++;
        	}
        }
        if(singleCount>0)
        	result+=1;
        return result;
    }
}
