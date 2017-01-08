package top100;
import java.util.HashMap;

public class romanToInteger_13 {
	public int romanToInt(String s){
		int result=0;
		for(int i =0; i < s.length();i++){
			char currChar = s.charAt(i);
			if(currChar=='D')
				result+=500;
			else if(currChar=='M')
				result+=1000;
			else if(currChar=='L')
				result+=50;
			else if(currChar=='V')
				result+=5;
			else if(currChar=='I'){
				if(i<s.length()-1){
					if(s.charAt(i+1)=='V'||s.charAt(i+1)=='X')
						result-=1;
					else
						result+=1;
				}
				else
					result+=1;
			}else if(currChar=='X'){
				if(i<s.length()-1){
					if(s.charAt(i+1)=='L'||s.charAt(i+1)=='C')
						result-=10;
					else
						result+=10;
				}
				else
					result+=10;
			}else if(currChar=='C'){
				if(i<s.length()-1){
					if(s.charAt(i+1)=='D'||s.charAt(i+1)=='M')
						result-=100;
					else
						result+=100;
				}
				else
					result+=100;
			}
			
		}
		return result;
	}
	
	
}
