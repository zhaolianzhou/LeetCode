package top100;

import java.util.Arrays;

public class addBinary_67 {
	public static String addBinary(String a, String b){
		char[] aArr = a.toCharArray();
		char[] bArr = b.toCharArray();
		int aLen = aArr.length;
		int bLen = bArr.length;
		int cLen = Math.max(aLen, bLen)+1;
		int sLen = Math.min(aLen, bLen);
		char[] c = new char[cLen];
		char[] lArr,sArr;
		if(aLen<bLen){
			lArr=bArr;
			sArr=aArr;
		}
		else{
			lArr=aArr;
			sArr=bArr;
		}
		int addNext = 0;
		int i=0,j=0,k=0;
		for(i =sLen-1,j=cLen-2,k=cLen-1; i>=0; i--,j--,k--){
			if(sArr[i]=='1'&&lArr[j]=='1'){
				if(addNext==1)
					c[k]='1';
				else{
					c[k]='0';
					addNext=1;
				}
			}
			else if(sArr[i]=='1'||lArr[j]=='1'){
				if(addNext==1)
					c[k]='0';
				else
					c[k]='1';
			}
			else{
				if(addNext==1){
					c[k]='1';
					addNext=0;
				}
				else
					c[k]='0';
			}
		}
		for(;j>=0;j--,k--){
			if(addNext==1){
				if(lArr[j]=='1')
					c[k]='0';
				else{
					c[k]='1';
					addNext=0;
				}
			}
			else
				c[k]=lArr[j];
		}
		if(addNext==1)
			c[k]='1';
		else
			c[k]='0';
		System.out.println(Arrays.toString(c));
		String result="";
		for(i = 0; i < cLen;i++)
			if(c[i]=='1')
				break;
		for(;i<cLen;i++)
			result+=c[i];
		if(result==null||result.length()==0)
			result = "0";
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("1","110"));
	}

}
