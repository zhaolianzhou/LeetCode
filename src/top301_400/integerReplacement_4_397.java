package top301_400;

public class integerReplacement_4_397 {
	public static int integerReplacement(int n){
		int reduceTime =0;
		Long newN = Long.parseLong(new Integer(n).toString());
		while(newN!=1){
			if(newN%2==0){
				newN = newN/2;
			}
			else{
				if((newN+1)%4==0&&newN-1!=2)
					newN=newN+1;
				else
					newN=newN-1;
			}
			reduceTime++;
		}
		return reduceTime;
	}
	public static void main(String[] args){
		int n = 2147483647;
		System.out.println(integerReplacement(n));
	}
}
