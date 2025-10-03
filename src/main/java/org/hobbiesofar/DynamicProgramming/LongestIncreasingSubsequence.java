package org.hobbiesofar.DynamicProgramming;

import java.util.Arrays;

/**
https://leetcode.com/problems/longest-increasing-subsequence/
*/
class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        Arrays.fill(array, 1);

        int maxLength  = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    array[i] = Math.max(array[i], array[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, array[i]);
        }
        return maxLength;
    }
}
