package top301_400;
/**
 * No 396
 * Description:
 * Given an array of integers A and let n to be its length.
 * Assume Bk to be an array obtained by rotating the array A k positions clock-wise, we define a "rotation function" F on A as follow:
 * F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].
 * Calculate the maximum value of F(0), F(1), ..., F(n-1).
 * @author Zhaolian
 *
 */
public class rotateFunction_396 {
	 public int maxRotateFunction(int[] A) {
		    int n = A.length;
				if(n == 0)
					return 0;
				int[] F = new int[n];
				int max= Integer.MIN_VALUE;
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
}
