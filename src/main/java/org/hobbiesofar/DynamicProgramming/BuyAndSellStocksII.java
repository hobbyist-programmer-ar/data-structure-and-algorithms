package org.hobbiesofar.DynamicProgramming;


/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
*/

class BuyAndSellStocksII {
    public int maxProfit(int[] prices){
        int totalProfit = 0;
        for(int day = 1; day < prices.length; day++) {
            int dailyProfit = prices[day] - prices[day - 1];
            totalProfit += Math.max(0, dailyProfit);
        }
        return totalProfit;
    }
}
