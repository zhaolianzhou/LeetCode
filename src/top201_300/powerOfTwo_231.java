package top201_300;

public class powerOfTwo_231 {
	public static boolean isPowerOfTwo(int n){
		if(n<=0)
			return false;
		if(n==1)
			return true;
		else if(n%2!=0)
			return false;
		else{
			n = n/2;
			return isPowerOfTwo(n);
		}
	}
	public static void main(String[] args){
		System.out.println(isPowerOfTwo(10));
	}
}
