package contest.weekly14;

public class licenseKeyFormat {
	public static String licenseKeyFormatting(String S, int K){
		String upperS = S.replaceAll("-", "");
		int first=upperS.length()%K;
		int group=upperS.length()/K;
		String result=upperS.substring(0, first).toUpperCase();
		if(first!=0&&group!=0)
			result+='-';
		int count=first;
		while(count<upperS.length()){
			result+=upperS.substring(count,count+K).toUpperCase();
			count+=K;
			if(count!=upperS.length())
				result+='-';	
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(licenseKeyFormatting("2-4A0r7-4k",4));

	}
}
