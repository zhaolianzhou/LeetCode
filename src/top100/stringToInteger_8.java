package top100;

public class stringToInteger_8 {
	 public static int myAtoi(String str) {
		 if(str.isEmpty())
			 return 0;
		 String[] result;
		 String token = "[^0-9+-]";
		 String token2 = "[+-]";
		 int pOrn = 1;  //positive or negative
		 result = str.split(token);
		 String item = "";
		 for(int i = 0; i < result.length; i++){
			 item = result[i];
			 if(!item.isEmpty())
				 break;
		 }
		 if(item.isEmpty())
			 return 0;
		 if(item.length()>2&&(item.substring(0,2).equals("+-")||
				 item.substring(0,2).equals("-+")||
				 item.substring(0,2).equals("++")||
				 item.substring(0,2).equals("--")))
			 return 0;
		 if(item.length()>12){
			 if(pOrn == 1)
				 return Integer.MAX_VALUE;
			 else
				 return Integer.MIN_VALUE;
		 }
		 if(item.charAt(0)=='-'){
			 pOrn = -1;
		 }
		 String[] item2 = item.split(token2);
		 for(String item3 : item2){
			 if(!item3.isEmpty()){
			 long temResult = Long.parseLong(item3);
			 if(temResult>Integer.MAX_VALUE){
				 if(pOrn == 1)
					 return Integer.MAX_VALUE;
				 else
					 return Integer.MIN_VALUE;
			 }
			 int firstNum=Integer.parseInt(item3)*pOrn;
			 return firstNum;
			}
		 }
		 /*for(int i=0; i <result.length; i++){
			 String item  = result[i];
			 String[] item2= {""};
			 if(item.isEmpty())
				 continue;
			 if(item.charAt(0)=='-'){
				 pOrn = -1;
			 }
			 if(item.length()>2&&(item.substring(0,2).equals("+-")||item.substring(0,2).equals("-+")))
				 return 0;
			 if(item.length()>12){
				 if(pOrn == 1)
					 return Integer.MAX_VALUE;
				 else
					 return Integer.MIN_VALUE;
			 }
			 item2 = item.split(token2);
			 for(String item3 : item2){
				 if(item3.isEmpty())
					 break;
				 if(!item3.isEmpty()){
				 long temResult = Long.parseLong(item3);
				 if(temResult>Integer.MAX_VALUE){
					 if(pOrn == 1)
						 return Integer.MAX_VALUE;
					 else
						 return Integer.MIN_VALUE;
				 }
				 int firstNum=Integer.parseInt(item3)*pOrn;
				 return firstNum;
				}
			}
		 }*/
		 return 0;
	 }
	 public static void main(String args[]){
		 System.out.println(myAtoi("++1"));
	 }
}
