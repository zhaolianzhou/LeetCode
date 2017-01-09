package contest.weekly14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class slideWindowMedian {
	public static double[] medianSlidingWindow(int[] nums, int k){
		int rl=nums.length-k+1;
		double[] resultArr=new double[rl];
		ArrayList<Integer> tem = new ArrayList<Integer>();
		for(int i=0; i< k; i++){
			tem.add(nums[i]);
		}
		for(int i =0; i < rl;i++){
			ArrayList<Integer> tem2=new ArrayList<Integer>(tem);
			System.out.println(tem);
			double currMedian=0.0;
			Collections.sort(tem2);
			System.out.println(tem2);
			if(k%2==0){
				currMedian= ((double)tem2.get(k/2-1)+(double)tem2.get(k/2))/2.0;
			}
			else{
				currMedian=tem2.get(k/2);
			}
			System.out.println(currMedian);
			resultArr[i]=currMedian;
			tem.remove(0);
			if(i+k<nums.length)
				tem.add(nums[i+k]);
		}
		return resultArr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums ={1,3,-1,-3,5,3,6,7};
		double[]result=medianSlidingWindow(nums,3);
		System.out.println(Arrays.toString(result));
	}
}
