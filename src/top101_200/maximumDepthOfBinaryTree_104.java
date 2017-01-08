package top101_200;
/**
 * No: 104
 * Description:
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * @author Zhaolian
 *
 */
public class maximumDepthOfBinaryTree_104 {
	int count = 0;
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	public int maxDepth(TreeNode root){
		return helper(root,0);
	}
	
	public int helper(TreeNode root, int count){
		if(root==null)
			return count;
		else{
			count++;
			int left = helper(root.left,count);
			int right = helper(root.right,count);
			if(left>right)
				return left;
			else
				return right;
			}
		}
	}
