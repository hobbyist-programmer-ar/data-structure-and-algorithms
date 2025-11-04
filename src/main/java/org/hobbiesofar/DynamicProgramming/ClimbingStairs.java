package org.hobbiesofar.DynamicProgramming;

/*
https://leetcode.com/problems/climbing-stairs
*/
class ClimbingStairs {
    public int climbStairs(int n) {
        int previousTwo = 0;
        int previousOne = 1;
        for(int step = 0; step < n; step++) {
            int current = previousOne + previousTwo;

            previousTwo = previousOne;
            previousOne = current;
        }
        return previousOne;
    }
}
