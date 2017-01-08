package top100;
/**
 * No 100
 * Description:
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * @author Zhaolian
 *
 */
public class sameTree_100 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	public static boolean isSameTree(TreeNode p, TreeNode q){
		if(p==null&&q==null)
			return true;
		else if(p==null||q==null)
			return false;
		else if(p.val!=q.val)
			return false;
		else
			return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
//		if(!isSameTree(p.left,q.left))
//			return false;
//		if(!isSameTree(p.right,q.right))
//			return false;
//		return true;
	}
	public static void main(String[] args){
		TreeNode t1 = new TreeNode(0);
		TreeNode t2 = new TreeNode(0);
		System.out.println(isSameTree(t1,t2));
	}
}
