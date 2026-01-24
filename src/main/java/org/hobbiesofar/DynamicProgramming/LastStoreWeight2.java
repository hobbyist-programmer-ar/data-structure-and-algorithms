package org.hobbiesofar.DynamicProgramming;

/*
https://leetcode.com/problems/last-stone-weight-ii
*/

class LastStoreWeight2 {
    public int lastStoneWeightII(int[] stones) {
        int totalSum = 0;
        for(int stone : stones) {
            totalSum += stone;
        }

        int numStone = stones.length;
        int targetCapacity = totalSum / 2;

        int[][] dp = new int [numStone + 1][targetCapacity + 1];

        for(int i = 1; i <= numStone; i++) {
            for(int j = 0; j <= targetCapacity; j++) {
                dp[i][j] = dp[i - 1][j];
                if(stones[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - stones[i - 1]] + stones[i - 1]);
                }
            }
        }

        return totalSum - dp[numStone][targetCapacity] * 2;
    }
}
