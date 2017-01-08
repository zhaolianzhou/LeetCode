package top100;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class onesAndZeroes_12 {
	
	static class StringLengthComparator implements Comparator<String>{
		@Override
		public int compare(String s1, String s2){
			return new Integer(s1.length()).compareTo(s2.length());
		}
	}
	public static HashMap<Character, Integer> countChar(String str){
		HashMap<Character, Integer> cc=new HashMap<Character, Integer>();
		for(char c : str.toCharArray()){
			if(cc.containsKey(c)){
				int count = cc.get(c)+1;
				cc.put(c, count);
			}
			else
				cc.put(c, 1);	
		}
		return cc;
	}
	public static int findMaxForm(String[] strs, int m, int n){
		int result=0;
		Arrays.sort(strs, new StringLengthComparator());
		for(int i = 0; i < strs.length;i++){
			String curr_str = strs[i];
			int c0=0, c1=0;
			HashMap<Character, Integer> cc = countChar(curr_str);
			if(cc.containsKey('0'))
				c0=cc.get('0');
			if(cc.containsKey('1'))
				c1=cc.get('1');
			if(m>=c0&&n>=c1){
				result++;
				m-=c0;
				n-=c1;
			}
		}
		return result;
	}
	public static void main(String[] args){
		String[] strs = {"111", "1000", "1000", "1000"};
		System.out.println(findMaxForm(strs,9,3));
	}

}


