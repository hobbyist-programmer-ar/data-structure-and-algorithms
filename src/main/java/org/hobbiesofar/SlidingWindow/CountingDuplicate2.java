package org.hobbiesofar.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/contains-duplicate-ii
*/
class CountingDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numToIndexMap = new HashMap();

        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            int previousIndex = numToIndexMap.getOrDefault(nums[currentIndex], -20000000);

            if(currentIndex - previousIndex <=k) {
                return true;
            }

            numToIndexMap.put(nums[currentIndex], currentIndex);
        }
        return false;
    }
}
