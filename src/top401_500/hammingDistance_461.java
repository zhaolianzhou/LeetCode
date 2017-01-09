package top401_500;

public class hammingDistance_461 {
	public static int hammingDistance(int x, int y) {
        String xs=Integer.toBinaryString(x);
        String ys=Integer.toBinaryString(y);
        int result=0;
        for(int i=xs.length();i<32;i++){
        	xs='0'+xs;
        }
        for(int i=ys.length();i<32;i++){
        	ys='0'+ys;
        }
        for(int i=0; i <32; i++){
        	if(xs.charAt(i)!=ys.charAt(i))
        		result++;
        }
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingDistance(1,4));
	}

}
