package top100;

public class implementstrStr_28 {
	public static int strStr(String haystack, String needle){
		if(needle==null||needle.length()==0)
			return 0;
		if(haystack.length()<needle.length())
			return -1;
		int n=haystack.length();
		int m = needle.length();
		for(int i = 0; i < n-m+1; i++){
			if(haystack.charAt(i)==needle.charAt(0)){
				String sub = haystack.substring(i, i+m);
				System.out.println(sub);
				if(sub.equals(needle))
					return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hay ="abdccd";
		String nee = "cd";
		System.out.println(strStr(hay, nee));
	}

}
