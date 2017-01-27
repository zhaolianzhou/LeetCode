package top201_300;

public class validPerfectSquare_367 {
	public static boolean isPerfectSquare(int num){
		if(num<=0)
			return false;
		if(num==1)
			return true;
		for(int i = 2; i < num/2+1;i++){
			if(i*i==num){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPerfectSquare(4));
	}

}
