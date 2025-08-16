package org.hobbiesofar.List;

/**
 * https://leetcode.com/problems/product-of-array-except-self
 */
class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 1;
        int right = 1;
        for(int i = 0; i < nums.length; i++) {
            ans[i] = left;
            left *= nums[i];
        }

        for(int j = nums.length - 1; j >= 0; j--) {
            ans[j] *= right;
            right *= nums[j];
        }
        return ans;
    }
}
