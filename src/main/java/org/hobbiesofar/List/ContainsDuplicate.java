package org.hobbiesofar.List;

import java.util.HashMap;
import java.util.HashSet;


/**
https://leetcode.com/problems/contains-duplicate/
*/
class ContainsDuplicate{
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(seen.contains(nums[i])) {
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }
}
