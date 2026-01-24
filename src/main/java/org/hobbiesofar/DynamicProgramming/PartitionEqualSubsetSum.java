package org.hobbiesofar.DynamicProgramming;

/*
https://leetcode.com/problems/partition-equal-subset-sum
*/

class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum % 2 == 1) {
            return false;
        }

        return knapsack(nums, sum / 2);
    }

    private boolean knapsack(int[] nums, int subsetSum) {
        boolean[] dp = new boolean [subsetSum + 1];
        dp[0] = true;

        for(int num : nums) {
            for(int i = subsetSum; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }

        return dp[subsetSum];
    }
}
