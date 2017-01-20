package top401_500;

public class arrangingCoins_441 {
	public static int arrangeCoins(int n){
		if(n==0)
			return 0;
		int i=1;
		for(;n>=0;i++){
			n=n-i;
		}
		return i-2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrangeCoins(8);
	}

}
