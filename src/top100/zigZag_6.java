package top100;
import java.util.ArrayList;

public class zigZag_6 {
	public static String convert(String s, int numRows) {
		if(numRows==1||numRows>s.length())
			return s;
        ArrayList<String> pos = new ArrayList<String>();
        String result = "";
        for(int i =0; i < numRows; i++){
        	pos.add(new String(s.substring(i, i+1)));
        }
        int n = numRows;
        boolean upTodown = false;
        while(n < s.length()){
        	if(upTodown){
        		for(int j =1; j < numRows; j++){
        			pos.set(j, pos.get(j)+s.charAt(n));	
        			n++;
        			if(n==s.length())
        				break;
        		}
        	}
        	else{
        		for(int j = numRows-2; j >=0; j--){	
        			pos.set(j, pos.get(j)+s.charAt(n));
        			n++;
        			if(n==s.length())
        				break;
        		}
        	}
        	upTodown=!upTodown;
        }
        for(String tem : pos){
        	result+=tem;
        }
        return result;
	}
	public static void main(String[] args){
		String s = "PAYPALISHIRING";
		System.out.println(convert(s,3));
	}
}
