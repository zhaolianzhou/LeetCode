package top101_200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascalTriangle_II_119 {
	public static List<Integer> getRow(int rowIndex){
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(rowIndex==0){
			result.add(1);
			System.out.println(result.toString());
			return result;
		}
		if(rowIndex==1){
			result.add(1);
			result.add(1);
			System.out.println(result.toString());
			return result;
		}
		
		result.add(1);
		result.add(1);
		for(int i=1;i<rowIndex;i++){
			ArrayList<Integer> resultNew = new ArrayList<Integer>();
			resultNew.add(1);
			for(int j=0;j<result.size()-1;j++){
				int tem = result.get(j)+result.get(j+1);
				resultNew.add(tem);
			}
			resultNew.add(1);
			result=resultNew;
		}
		System.out.println(result.toString());
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRow(4);
	}

}
