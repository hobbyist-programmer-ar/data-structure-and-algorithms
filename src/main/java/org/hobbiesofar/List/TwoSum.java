package org.hobbiesofar.List;

import java.util.HashMap;
import java.util.Map;


/**
https://leetcode.com/problems/two-sum/
*/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
                if(numIndexMap.containsKey(diff)) {
                    return new int[]{i, numIndexMap.get(diff)};
                }
                numIndexMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
