package contest_weekly_16B;

import java.util.Arrays;

public class constructRectangle_492 {
	public static int[] contructRectangle(int area){
		int[] result=new int[2];
		int sqrtA = (int) Math.sqrt(area);
		while(area%sqrtA!=0){
			sqrtA--;
		}
		int L = area/sqrtA;
		result[0]=L;
		result[1]=sqrtA;
		System.out.println(Arrays.toString(result));
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(contructRectangle(12));
	}

}
