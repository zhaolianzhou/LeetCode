package top301_400;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class reverseVowelsofaString_345 {
	public  static String reverseVowels(String s){
		if(s==null||s.length()==0)
			return s;
		HashSet<Character> vowel = new HashSet<Character>() 
		{{add('a'); add('e');add('i');add('o');add('u');
		add('A'); add('E');add('I');add('O');add('U');}};
		char[] SList = s.toCharArray();
		int start = 0;
		int end = SList.length-1;
		while(start<end){
			if(vowel.contains(SList[start])&&vowel.contains(SList[end])){
				char tem = SList[start];
				SList[start]=SList[end];
				SList[end]=tem;
				start++;
				end--;
			}
			else if(!vowel.contains(SList[start])&&vowel.contains(SList[end])){
				start++;
			}
			else if(vowel.contains(SList[start])&&!vowel.contains(SList[end])){
				end--;
			}
			else{
				start++;
				end--;
			}
		}
		String result = new String(SList);
//		ArrayList<Character> vowelInS=new ArrayList<Character>();
//		char[] SArray=s.toCharArray();
//		for(char c : SArray){
//			if(vowel.contains(c)){
//				vowelInS.add(c);
//			}
//		}
//		Collections.reverse(vowelInS);
//		String result = "";
//		for(int i = 0, j =0; i < SArray.length;i++){
//			if(vowel.contains(SArray[i])){
//				SArray[i]=vowelInS.get(j);
//				j++;
//			}
//			result+=SArray[i];
//		}
		
		return result;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("leetcode"));
	}

}
