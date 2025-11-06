package org.hobbiesofar.DynamicProgramming;

/*
https://leetcode.com/problems/house-robber-ii/description/
*/
class HouseRobberII {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) {
            return nums[0];
        }

        return Math.max(rob(nums, 0, n - 2), rob(nums, 1, n - 1));
    }

    private int rob(int[] nums, int start, int end) {
        int prev1 = 0, prev2 = 0;
        for(int i = start; i <= end; i++) {
            int dp = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = dp;
        }
        return prev1;
    }
}
