package contest_weekly_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class findModeInBinaryTree_501 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	static HashMap<Integer, Integer> modeCount = new HashMap<Integer, Integer>();
	public static int[] findMode(TreeNode root){
		help(root);
		ArrayList<Integer> modes = new ArrayList<Integer>();
		int mode = Integer.MIN_VALUE;
		for(int k : modeCount.values()){
			if(k>mode)
				mode=k;
		}
		for(int k:modeCount.keySet()){
			if(modeCount.get(k)==mode)
				modes.add(k);
		}
		int[] result = new int[modes.size()];
		for(int i =0; i < modes.size();i++){
			result[i] = modes.get(i);
		}
		return result;
	}
	private static void help(TreeNode root){
		if(root==null)
			return;
		if(modeCount.containsKey(root.val)){
			int count = modeCount.get(root.val)+1;
			modeCount.put(root.val, count);
		}else{
			modeCount.put(root.val, 1);
		}
		help(root.left);
		help(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode r = new TreeNode(1);
		r.right = new TreeNode(1);
		int[] result = findMode(r);
		System.out.println(Arrays.toString(result));
	}

}
