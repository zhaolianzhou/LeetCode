package top101_200;
import java.util.HashMap;
/**
 * Related to question Excel Sheet Column Title
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * For example:
 *  A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 * @author Zhaolian
 *
 */
public class excelSheetColumnNumber_171 {
	public int titleToNumber(String s) {
        int result = 0;
        for(int j = s.length()-1; j >= 0; j--){
        	char curr_char = s.charAt(j);
        	result +=(curr_char-64)* Math.pow(26,s.length()-1-j );
        }
        return result;
    }
}
