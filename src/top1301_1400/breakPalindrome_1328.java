package top1301_1400;

import java.util.Arrays;

public class breakPalindrome_1328 {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1)
            return "";

        char[] chars = palindrome.toCharArray();
        int middle = Math.abs(chars.length/2);
        for (int i =0; i < middle; i++) {
            if (chars[i]!='a') {
                chars[i]='a';
                return new String(chars);
            }
        }
        if (chars[middle] == 'a' || middle > 1)
            chars[chars.length-1] = 'b';
        else
            chars[middle+1] = 'b';
        return new String(chars);
    }

    public static void main(String[] args) {
        breakPalindrome_1328 test = new breakPalindrome_1328();
        System.out.printf(test.breakPalindrome("aba"));
    }
}