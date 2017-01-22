package top301_400;

public class guessNumberHigherorLower_374 {
	public static int picked = 2147483647;
	public static int guess(int num){
		if(num>picked)
			return -1;
		if(num<picked)
			return 1;
		else
			return 0;
	}
	public static int guessNumber(int n){
		int tem=n/2+1;
		long tem2=(long)n/2+1;
		long bottom=1;
		long top=(long)n+1;
		int hiOrLo= guess(tem);
		while(hiOrLo!=0){
			if(hiOrLo==-1){
				top=tem;	
			}
			else{
				bottom=tem;
			}
			tem2=(top+bottom)/2;
			tem=(int)tem2;
			hiOrLo=guess(tem);
		}
		return tem;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(guessNumber(2147483647));
	}

}
