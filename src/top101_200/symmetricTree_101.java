package top101_200;

import top101_200.BSTLevelOrderTraversal_102.TreeNode;

public class symmetricTree_101 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	public static boolean isSymmetric(TreeNode root){
		if(root==null)
			return true;
		return symmeHelper(root.left, root.right);
	}
	
	public static boolean symmeHelper(TreeNode left, TreeNode right){
		if(left==null&&right==null)
			return true;
		if(left==null||right==null||left.val!=right.val)
			return false;
		else
			return (symmeHelper(left.left, right.right)&&symmeHelper(left.right, right.left));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
//		root.left.left=new TreeNode(7);
		root.left.right=new TreeNode(7);
//		root.right.left=new TreeNode(3);
		root.right.right = new TreeNode(7);
		System.out.println(isSymmetric(root));
	}

}
