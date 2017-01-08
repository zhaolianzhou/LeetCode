package top101_200;
/**
 * No 190
 * DEscription:
 * Reverse bits of a given 32 bits unsigned integer.
 * For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).
 * Follow up:
 * If this function is called many times, how would you optimize it?
 * Related problem: Reverse Integer
 * @author Zhaolian
 *
 */
public class reverseBits_190 {
	// you need treat n as an unsigned value
    public static int reverseBits(int n) {
        String numBits = Integer.toUnsignedString(n, 2);
        while(numBits.length()<32){
        	numBits = "0"+numBits;
        }
        String reverseBit = new StringBuilder(numBits).reverse().toString();
        System.out.println(reverseBit);
        
        int reverseNum = Integer.parseUnsignedInt(reverseBit, 2);
        System.out.println(reverseNum);
        return reverseNum;
    }
    
    public static void main(String[] args){
    	reverseBits(1);
    }
}
