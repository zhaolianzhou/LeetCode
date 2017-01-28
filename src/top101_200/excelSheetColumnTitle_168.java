package top101_200;

import java.util.HashMap;

public class excelSheetColumnTitle_168 {
	public static String convertToTitle(int n){
		String result = "";
		int temN = n;
		HashMap<Integer,Character> xlCol = new HashMap<Integer, Character>();
		for(int i = 1; i<27;i++){
			xlCol.put(i, (char)('A'+i-1));
		}
		while(temN!=0){
			int curr = temN%26;
			if(curr==0){
				result=xlCol.get(26)+result;
				curr=26;
			}else{
				result=xlCol.get(curr)+result;
			}
			temN=temN-curr;
			temN=temN/26;
		}
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertToTitle(1);
	}

}
