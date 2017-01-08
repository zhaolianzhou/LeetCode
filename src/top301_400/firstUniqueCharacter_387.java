package top301_400;
import java.util.HashMap;

/**
 * No 387
 * Description:
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * Examples:
 * s = "leetcode"
 * return 0.
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 * @author Zhaolian
 *
 */
public class firstUniqueCharacter_387 {
	public static int firstUniqChar(String s) {
        char[] sArray = s.toCharArray();
        System.out.println(sArray);
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>(); 
        for(char sc : sArray){
        	if(sMap.containsKey(sc)){
        		int value = sMap.get(sc)+1;
        		sMap.put(sc, value);
        	}
        	else
        		sMap.put(sc,1);
        }
        int index = -1;
        for(int i = 0; i < sArray.length;i++){
        	if(sMap.get(sArray[i])==1){
        		index = i;
        		break;
        	}
        }
        return index;
    }
	
	public static void main(String[] args){
		int index = firstUniqChar("leetcode");
		System.out.println(index);
	}
}
