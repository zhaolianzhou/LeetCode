package top100;

public class lengthOfLastWord_58 {
	public static int lengthOfLastWord(String s){
		String[] sArr = s.split(" ");
		if(sArr==null||sArr.length==0)
			return 0;
		String lastS = sArr[sArr.length-1];
		if(lastS==null)
			return 0;
		else
			return lastS.length();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord(" "));
	}

}
