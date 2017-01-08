package top401_500;
/**
 * Problem No: 404
 * Description: Find the sum of all left leaves in a given binary tree.
 * Solution: Traverse of tree.
 * @author Zhaolian
 *
 */
public class sumOfLeftLeaves_404 {
	public int sum = 0;
	public boolean isLeft = false;
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	public  int sumOfLeftLeaves(TreeNode root){
		if(root == null)
			return sum;
		if(root.left==null&&root.right==null&&isLeft){
			sum+=root.val;
		}
		if(root.left!=null){
			isLeft= true;
			sumOfLeftLeaves(root.left);
		}
		if(root.right!=null){
			isLeft = false;
			sumOfLeftLeaves(root.right);
		}
		return sum;
	}
	public static void main(String args[]){
		sumOfLeftLeaves_404 myTreeSum  = new sumOfLeftLeaves_404();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right =  new TreeNode(7);
		System.out.println(myTreeSum.sumOfLeftLeaves(root));
	}
}
