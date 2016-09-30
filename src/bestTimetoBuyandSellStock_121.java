/**
 * Problem No: 121
 * Best Time to Buy and Sell Stock
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction 
 * (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * Tags: Array, Dynamic Programming
 * @author Zhaolian
 *
 */
public class bestTimetoBuyandSellStock_121 {
	public int maxProfit(int[] prices){
		if(prices.length==0||prices == null)
			return 0;
		int maxProfit = 0;
		int buyPrice = prices[0];
		for(int i =0; i < prices.length; i++){
			if(prices[i]<buyPrice)
				buyPrice = prices[i];
			else
				if(prices[i]-buyPrice > maxProfit)
					maxProfit = prices[i]-buyPrice;
		}
		return maxProfit;
	}
}
