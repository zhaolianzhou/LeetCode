package top201_300;

public class firstBadVersion_278 {
	public static boolean isBadVersion(int version){
//		int firstBadVersion = 1702766719;
		int firstBadVersion = 2;
		if(version>=firstBadVersion)
			return true;
		else
			return false;
	}
	public static int firstBadVersion(int n){
//		if(n==1&&isBadVersion(n))
//			return 1;
		int start = 1;
		int end = n;
		int middle =(int) ((long)start+(long)end)/2;
		while(start!=middle){
			if(isBadVersion(middle)){
				end=middle;
				long wh = ((long)start+(long)end)/2;
				middle=(int)wh;
			}
			else{
				start=middle;
				long wh = ((long)start+(long)end)/2;
				middle=(int)wh;
				
			}
		}
		if(isBadVersion(middle))
			return middle;
		else
			return end;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstBadVersion(2126753390));
		System.out.println(firstBadVersion(3));
	}

}
