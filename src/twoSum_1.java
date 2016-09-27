
public class twoSum_1 {
	 public static int[] twoSum(int[] nums, int target) {
		 int[] result = {-1,-1};
	        for(int i = 0; i< nums.length; i++){
	        	int l = nums[i];
	        	for(int j = i+1; j < nums.length;j++){
	        		int r = nums[j];
	        		if(l+r == target){
	        			result[0] = i;
	        			result[1] = j;
	        		}
	        	}
	        }
	        
	        return result;
	    }
	 public static void main(String[] args){
		 int[] nums = {2,7,11,15};
		 int target = 9;
		 int[] result= twoSum(nums,target);
		 System.out.println("["+result[0]+", "+result[1]+"]");
	 }
}
