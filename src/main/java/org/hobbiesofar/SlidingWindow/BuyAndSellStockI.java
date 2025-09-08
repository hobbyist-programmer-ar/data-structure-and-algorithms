package org.hobbiesofar.SlidingWindow;


/**
* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
*/
class SlidingWindow {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int minPrice = prices[0];
        for(int currentPrice : prices){
            maxProfit = Math.max(maxProfit, currentPrice - minPrice);
            minPrice = Math.min(minPrice, currentPrice);
        }
        return maxProfit;
    }
}
