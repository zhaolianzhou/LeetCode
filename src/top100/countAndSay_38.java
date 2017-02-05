package top100;

public class countAndSay_38 {
	public static String countAndSay(int n){
		String result = "1";
		if(n==1)
			return result;
		for(int i=1; i <n;i++){
			String newResult = "";
			char curr_char = result.charAt(0);
			int count = 0;
			int m = result.length();
			for(int j = 0;j < m;j++){
				if(result.charAt(j)==curr_char){
					count++;
				}
				else{
					newResult+=Integer.toString(count);
					newResult+=curr_char;
					curr_char = result.charAt(j);
					count = 1;
				}
			}
			newResult+=Integer.toString(count);
			newResult+=curr_char;
			result = newResult;
		}
		return result;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(6));
	}

}
