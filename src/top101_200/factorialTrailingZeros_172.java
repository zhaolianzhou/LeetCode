package top101_200;

public class factorialTrailingZeros_172 {
	public static int trailingZeroes(int n){
		int No5 = 0;
		while(n>0){
			n/=5;
			No5+=n;
		}
		return No5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeroes(125));
	}
}
