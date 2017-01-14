package top101_200;

public class numberOf1Bits_191 {
	public static int hammingWeight(int n){
		String ns = Integer.toBinaryString(n);
		System.out.println(ns);
		int result=0;
		for(char a: ns.toCharArray()){
			if(a=='1')
				result++;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(11));
	}
}
