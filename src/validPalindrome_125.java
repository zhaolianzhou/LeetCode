/**
 * No 125
 * Description:
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * For the purpose of this problem, we define empty string as valid palindrome.
 * @author Zhaolian
 *
 */
public class validPalindrome_125 {
	public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        for(int i =0; i < str.length()/2;i++){
        	if(str.charAt(i)!=str.charAt(str.length()-1-i))
        		return false;
        }
        return true;
    }
}
