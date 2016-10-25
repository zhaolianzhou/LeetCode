/**
 * Problem No: 437
 * Description: 
 * You are given a binary tree in which each node contains an integer value.

Find the number of paths that sum to a given value.

The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

Example:

root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

      10
     /  \
    5   -3
   / \    \
  3   2   11
 / \   \
3  -2   1

Return 3. The paths that sum to 8 are:

1.  5 -> 3
2.  5 -> 2 -> 1
3. -3 -> 11
 * @author Zhaolian
 *
 */

public class pathSumIII_437 {
	private int currSum = 0;
	private static int result = 0;
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
	
	public int pathSum(TreeNode root, int sum){
		if(root==null)
			return 0;
		sumHelper(root,sum);
		pathSum(root.left,sum);
		pathSum(root.right,sum);
		return result;
		
		/*
		 private int currSum = 0;
	private int result = 0;
    public int pathSum(TreeNode root, int sum) {
        if(root==null)
			return 0;
		currSum += root.val;
		if(currSum == sum){
			currSum =0;
			return 1;
		}
		if(currSum > sum)
			currSum =0;
		result+=pathSum(root.left,sum)+pathSum(root.right,sum);
		return result;
		 */
	}
	
	private void sumHelper(TreeNode root, int sum){
		if(root==null)
			return;
		if(sum==root.val)
			result++;
		sumHelper(root.left,sum-root.val);
		sumHelper(root.right,sum-root.val);
	}
	public static void main(String args[]){
		pathSumIII_437 myPathSum = new pathSumIII_437();
//		TreeNode root = new TreeNode(10);
//		root.left = new TreeNode(5);
//		root.left.left = new TreeNode(3);
//		root.left.right = new TreeNode(2);
//		root.left.left.left = new TreeNode(3);
//		root.left.left.right = new TreeNode(-2);
//		root.left.right.right = new TreeNode(1);
//		root.right = new TreeNode(-3);
//		root.right.right =  new TreeNode(11);
		
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right = new TreeNode(8);
		root.right.left =  new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);
		System.out.println(myPathSum.pathSum(root, 22));
	}
}
