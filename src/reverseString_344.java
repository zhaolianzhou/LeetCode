
public class reverseString_344 {
	/**
	 * Time Limit Exceeded for long input
	 * @param s
	 * @return
	 */
//	public static String reverseString(String s) {
//        String result = "";
//        for(int i=(s.length()-1); i >=0; i--){
//        	result+=s.charAt(i);
//        }
//        return result;
//    }
	public static String reverseString(String s) {
	
		if(s==null||s.length()==0)
			return "";
        char[] result = new char[s.length()];
        for(int i=0; i <s.length(); i++){
        	result[i]=s.charAt(s.length()-i-1);
        }
        return new String(result);
    }
	public static void main(String[] args){
		System.out.println(reverseString("hello"));
	}
}
