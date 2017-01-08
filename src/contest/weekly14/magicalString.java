package contest.weekly14;

import java.util.ArrayList;

public class magicalString {
	public static int magicalString(int n){
		if(n==0)
			return 0;
		ArrayList<Integer> S = new ArrayList<Integer>();
		S.add(1);
		S.add(2);
		int currIndex=1;
		int previous1=1;
		int previous2=2;
		int count=S.size();
		int count1=1;
		boolean is2Pre=true;
		System.out.println(S);
		while(count<n){
			if(S.get(currIndex)==1){
				currIndex++;
				if(previous2==1)
					S.add(2);
				else
				{
					S.add(1);
					count1++;
				}
			}
			else{
				if(previous1==previous2){
					currIndex++;
					if(previous2==1)
						S.add(2);
					else{
						S.add(1);
						count1++;
					}
				}
				else{
					if(is2Pre==false){
						if(previous2==1)
							S.add(2);
						else
						{
							S.add(1);
							count1++;
						}
					}
					else{
						if(previous2==1)
							count1++;
						S.add(previous2);
					}
				}
				is2Pre=!is2Pre;
			}
			count++;
			previous1=S.get(count-2);
			previous2=S.get(count-1);	
		}
		System.out.println(S);
		return count1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(magicalString(6));
	}

}
