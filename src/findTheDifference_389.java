
import java.util.HashMap;
/**
 * No 389
 * Description:
 * Given two strings s and t which consist of only lowercase letters.
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * Find the letter that was added in t.
 * @author Zhaolian
 * Note: keep duplication letters in the string
 */
public class findTheDifference_389 {
	public static char findTheDifference(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        HashMap<Character,Integer> sSet = new HashMap<Character, Integer>();
        for(char sc : sArray){
        	if(sSet.containsKey(sc)){
        		int value = sSet.get(sc)+1;
        		sSet.put(sc,value);
        	}else{
        		sSet.put(sc, 1);
        	}
        }
        char result =' ';
        for(char tc : tArray){
        	if(!sSet.containsKey(tc)){
        		result = tc;
        	}else if(sSet.get(tc)==0){
        		result = tc;
        	}else{
        		int value = sSet.get(tc)-1;
        		sSet.put(tc, value);
        	}
        }
        return result;
    }
	
	public static void main(String[] args){
		System.out.println(findTheDifference("a","aa"));
	}
}