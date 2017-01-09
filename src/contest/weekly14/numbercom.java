package contest.weekly14;

public class numbercom {
	public static int findComplement(int num){
		String result="";
		String numStr = Integer.toBinaryString(num);
		for(char a : numStr.toCharArray()){
			if(a=='1'){
				result+='0';
			}
			else
				result+='1';
		}
		return Integer.parseInt(result,2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findComplement(8));
	}

}
