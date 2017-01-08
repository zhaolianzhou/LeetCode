package top100;


public class palindromeNumber_9 {
	 public boolean isPalindrome(int x) {
		 if(x < 0)
			 return false;
		 else{
			 int a = x;
			 int b = 0;
			 while(a!=0){
				 b = b*10+a%10;
				 a = a/10;
			 }
			 return x == b;
		 }
	 }
}
