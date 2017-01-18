package top101_200;

import java.util.ArrayList;
import java.util.List;


public class BSTLevelOrderTraversal_102 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		if(root==null)
			return new ArrayList<List<Integer>>();
        ArrayList<TreeNode> ordlevel = new ArrayList<TreeNode>();
        ArrayList<TreeNode> newlevel = new ArrayList<TreeNode>();
        ArrayList<Integer> result2 = new ArrayList<Integer>();
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        ordlevel.add(root);
       while(!ordlevel.isEmpty()){
    	   for(TreeNode a : ordlevel){
           	if(a.left!=null) newlevel.add(a.left);
           	if(a.right!=null) newlevel.add(a.right);
           	result2.add(a.val);
           }
           ordlevel=newlevel;    
           result.add(result2);
           result2 = new ArrayList<Integer>();
           newlevel = new ArrayList<TreeNode>();
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(levelOrderBottom(root));
	}

}
