import java.util.HashMap;

/**
 * No 383
 * Description:
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * @author Zhaolian
 *
 */
public class randomNote_383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		char[] sArray = magazine.toCharArray();
        char[] tArray = ransomNote.toCharArray();
        HashMap<Character,Integer> sSet = new HashMap<Character, Integer>();
        for(char sc : sArray){
        	if(sSet.containsKey(sc)){
        		int value = sSet.get(sc)+1;
        		sSet.put(sc,value);
        	}else{
        		sSet.put(sc, 1);
        	}
        }
        boolean result =true;
        for(char tc : tArray){
        	if(!sSet.containsKey(tc)){
        		result = false;
        	}else if(sSet.get(tc)==0){
        		result = false;
        	}else{
        		int value = sSet.get(tc)-1;
        		sSet.put(tc, value);
        	}
        }
        return result;
	}
}
