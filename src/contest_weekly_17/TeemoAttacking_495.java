package contest_weekly_17;

public class TeemoAttacking_495 {
	public static int findPosisonedDuration(int[] timeSeries, int duration){
		if(timeSeries==null||timeSeries.length==0)
			return 0;
		int poiTime=0;
		int len =  timeSeries.length;
		for(int i =1; i < len;i++){
			if(timeSeries[i]-timeSeries[i-1]>=duration){
				poiTime+=duration;
			}
			else{
				poiTime+=timeSeries[i]-timeSeries[i-1];
			}
		}
		poiTime+=duration;
		return poiTime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] timeS = {1,2};
		int res = findPosisonedDuration(timeS,4);
		System.out.println(res);
	}

}
