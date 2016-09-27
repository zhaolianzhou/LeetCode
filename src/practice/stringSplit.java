package practice;

public class stringSplit {
	public static int myAtoi(String str) {
		 String[] result;
		 String token = "[^0-9+-]";
		 String token2 = "[+-]";
		 int pOrn = 1;  //positive or negative
		 result = str.split(token);
		 for(int i=0; i <result.length; i++){
			 System.out.println(result[i]);
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
					 System.out.println("Item too big.");
				 }
				 item2 = item.split(token2);
				 for(String item3 : item2){
				     if(item3.isEmpty())
						 break;
					 if(!item3.isEmpty()){
					 long temResult = Long.parseLong(item3);
					 if(temResult>Integer.MAX_VALUE){
						 System.out.println("Item too big");
					 }
					 int firstNum=Integer.parseInt(item3)*pOrn;
					 return firstNum;
				 }
				}
		 }
		 return result.length;
	}
	
	public static void main(String[] args){
		System.out.println("number of results:"+myAtoi("+1"));
	}
	
}
