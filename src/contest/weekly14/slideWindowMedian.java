package contest.weekly14;
import java.util.ArrayList;
import java.util.Arrays;

public class slideWindowMedian {
	public double[] medianSlidingWindow(int[] nums, int k){
		ArrayList<Double> result= new ArrayList<Double>();
		int[] tem=new int[k];
		for(int i=0; i< k; i++){
			tem[i]=nums[i];
		}
		int miden=k/2;
		Arrays.sort(tem);
		if(k%2==0){
			
		}
		double[] resultArr=new double[result.size()];
		return resultArr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
