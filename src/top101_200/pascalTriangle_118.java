package top101_200;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle_118 {
	public static List<List<Integer>> generate(int numRows){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		ArrayList<Integer> curr = new ArrayList<Integer>();
		curr.add(1);
		result.add(curr);
		if(numRows ==1 ){
			return result;
		}
		curr = new ArrayList<Integer>();
		curr.add(1);
		curr.add(1);
		result.add(curr);
		if(numRows == 2)
			return result;
		for(int i=2; i <numRows;i++){
			curr = new ArrayList<Integer>();
			ArrayList<Integer> former = (ArrayList<Integer>) result.get(i-1);
			curr.add(1);
			for(int j=0;j<i-1;j++ ){
				curr.add(former.get(j)+former.get(j+1));
			}
			curr.add(1);
			result.add(curr);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generate(4);
	}

}
