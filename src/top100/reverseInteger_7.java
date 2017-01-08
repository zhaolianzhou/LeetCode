package top100;

public class reverseInteger_7 {
	public static int reverse(int x) {
		int symbol = 1;
		if(x<0)
			symbol = -1;
		if(x<10&&x>-10)
			return x;
		if(x==Integer.MIN_VALUE)
			return 0;
        StringBuilder init = new StringBuilder();
        init.append(Math.abs(x));
        System.out.println(Math.abs(x));
        System.out.println(init.toString());
        String init2 = init.reverse().toString();
        System.out.println(init2);
        if(init2.length()>9&&Integer.parseInt(init2.substring(0, init2.length()-1))>Integer.MAX_VALUE/10)
			return 0;
        else{
        	Integer result = Integer.parseInt(init2);
        	return result.intValue()*symbol;
        }
    }
	public static void main(String args[]){
		System.out.println(reverse(-2147483648));
	}
}
