package top101_200;

public class bestTimetoBuyandSellStock_II_122 {
	public static int maxProfit(int[] prices){
		int profit = 0;
		int start = prices[0];
		int curr_high = prices[0];
		int curr_low = prices[0];
		int n = prices.length;
		boolean incre =true;
		for(int i=0; i <n;i++){
			if(prices[i]<curr_high&&incre==true){
				profit+=curr_high-curr_low;
				curr_low= prices[i];
				incre = false;
			}
			if(prices[i]>curr_low&&incre ==false){
				curr_high = prices[i];
				incre = true;
			}
			if(prices[i]>curr_high&&incre==true){
				curr_high = prices[i];
			}
			if(prices[i]<curr_low&&incre==false){
				curr_low = prices[i];
			}
		}
		if(incre==true){
			profit+=curr_high-curr_low;
		}
		return profit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1,3,2,4,5,1,7};
		int profit  = maxProfit(prices);
		System.out.println(profit);
	}

}
