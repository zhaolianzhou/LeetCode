package top100;

public class convertSortedArraytoBST_108 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	public static TreeNode sortedArrayToBST(int[] nums){
		if(nums==null||nums.length==0)
			return null;
		else{
			int nl = nums.length;
			TreeNode root = new TreeNode(nums[nl/2]);
			if(nl==1){
				root.left=null;
				root.right=null;
			}
			else{
				int llen=nl/2;
				int rlen = nl-nl/2-1;	
				int[] lnums = new int[llen];
				int[] rnums = new int[rlen];
				for(int i =0; i <llen;i++){
					lnums[i]=nums[i];
				}
				for(int i = llen+1;i<nl;i++){
					rnums[i-nl/2-1] = nums[i];
				}
				root.left = sortedArrayToBST(lnums);
				root.right = sortedArrayToBST(rnums);
			}
			return root;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3,4,5,6};
		TreeNode myBST = sortedArrayToBST(nums);
		System.out.println(myBST.val);
	}

}
