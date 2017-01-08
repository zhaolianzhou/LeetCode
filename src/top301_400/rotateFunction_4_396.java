package top301_400;

public class rotateFunction_4_396 {
	public static int maxRotateFunction(int[] A){
		int n = A.length;
		if(n == 0)
			return 0;
		int[] F = new int[n];
		int max = Integer.MIN_VALUE;
		for(int i =0; i < n; i++){
			int[] B = new int[n];
			System.arraycopy(A, 0, B, i, n-i);
			System.arraycopy(A, n-i, B, 0, i);
			F[i]=0;
			for(int j =0; j < n; j++){
				F[i]+=j*B[j];
			}
			if(max<F[i])
				max = F[i];
		}
		return max;
	}
	
	public static int maxOfArray(int[] F){
		int max = F[0];
		for(int i = 0; i < F.length; i++){
			if (max < F[i])
				max = F[i];
		}
		return max;
	}
	
	public static void main(String[] args){
		int[] A = {4,3,2,6};
		System.out.println(maxRotateFunction(A));
	}
}
