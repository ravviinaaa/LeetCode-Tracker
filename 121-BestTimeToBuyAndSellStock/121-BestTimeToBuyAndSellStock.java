// Last updated: 7/9/2026, 11:26:27 AM
class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {

            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}