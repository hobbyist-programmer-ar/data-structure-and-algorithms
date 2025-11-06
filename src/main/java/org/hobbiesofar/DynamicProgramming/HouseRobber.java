package org.hobbiesofar.DynamicProgramming;


/*
https://leetcode.com/problems/house-robber-ii/description/
*/
class HouseRobber {
    public int rob(int[] nums) {
        int prev2 = 0;
        int prev1 = 0;
        for(int num : nums) {
            int dp = Math.max(prev2 + num, prev1);
            prev2 = prev1;
            prev1 = dp;
        }
        return prev1;
    }
}
