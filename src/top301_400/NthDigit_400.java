package top301_400;

import java.util.ArrayList;

public class NthDigit_400 {
	public static int findNthDigit(int n){
		if(n<=9)
			return n;
		ArrayList<Integer> digitPos = new ArrayList<Integer>();
		digitPos.add(9);
		for(int i=1; ;i++){
			double curr = 9*Math.pow(10, i)*(i+1);
			if(curr<2147483648.0){
				digitPos.add((int)curr+digitPos.get(i-1));
			}
			else
				break;
		}
		digitPos.add((int)Math.pow(2,31));
		for(int i = 1; ;i++){
			if(digitPos.get(i)>=n){
				int init = (int)Math.pow(10, i);
				int numOrder = (int)((double)n-digitPos.get(i-1))/(i+1);
				int digitOrder = (int)((double)n-digitPos.get(i-1))%(i+1);
				if(digitOrder==0){
					int num = init+numOrder-1;
					return num%10;
				}
				else{
					int num = init+numOrder;
					String numS = Integer.toString(num);
					char reChar = numS.charAt(digitOrder-1);
					return reChar-48;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findNthDigit(1000000000));
	}

}
