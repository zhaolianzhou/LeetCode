package top201_300;
/**
 * No 226
 * Description: Invert Binary Tree
 * @author Zhaolian
 *
 */
public class invertBinaryTree_226 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	public TreeNode invertTree(TreeNode root) {
        if(root==null)
        	return root;
        TreeNode tem = root.right;
        root.right=root.left;
        root.left=tem;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
