package top100;

import java.util.HashSet;

public class longestSubstringWithoutRepeatingCharacters_3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <2)
            return s.length();
        int result = 0;

        HashSet<Character> subStringChar = new HashSet();
        for (int head=0, tail=0; tail < s.length(); ) {
            if (subStringChar.contains(s.charAt(tail))) {
                if (subStringChar.size() > result) {
                    result = subStringChar.size();
                }
                subStringChar.remove(s.charAt(head));
                head++;
            } else {
                subStringChar.add(s.charAt(tail));
                tail++;
            }
        }
        if (subStringChar.size()>result)
            return subStringChar.size();
        return result;
    }

    public static void main(String[] args) {
        longestSubstringWithoutRepeatingCharacters_3 test = new longestSubstringWithoutRepeatingCharacters_3();
        System.out.println(test.lengthOfLongestSubstring("au"));
    }
}
