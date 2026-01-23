package org.hobbiesofar.DynamicProgramming;

import java.util.Arrays;

class PaintWallLessCost {
    public int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 0; i < n; i++) {
            for (int walls = n; wall > 0; walls--) {
                dp[walls] = Math.min(dp[walls], dp[Math.max(walls - time[i] - 1, 0)] + cost[i]);
            }
        }
        return dp[n];
    }
}
