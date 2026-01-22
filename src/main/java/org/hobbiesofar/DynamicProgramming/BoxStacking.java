package org.hobbiesofar.DynamicProgramming;

import java.util.Arrays;

/*
https://leetcode.com/problems/maximum-height-by-stacking-cuboids
*/
class BoxStacking {
    public int maxHeight(int[][] cuboids) {
        int numberOfCuboids = cuboids.length;
        for(int[] cuboid : cuboids) {
            Arrays.sort(cuboid);
        }

        Arrays.sort(cuboids, (cuboidA, cuboidB) -> {
           if(cuboidA[0] != cuboidB[0]){
               return cuboidA[0] - cuboidB[0];
           }
           if(cuboidA[1] != cuboidB[1]){
               return cuboidA[1] - cuboidB[1];
           }
           return cuboidA[2] - cuboidB[2];
        });

        int[] dp = new int[numberOfCuboids];

        for(int currentIndex = 0; currentIndex < numberOfCuboids; currentIndex++) {
            for(int previousIndex = 0; previousIndex < currentIndex; previousIndex++) {
                boolean canStack = cuboids[previousIndex][1] <= cuboids[currentIndex][1]
                    && cuboids[previousIndex][2] <= cuboids[currentIndex][2];

                if(canStack) {
                    Math.max(dp[currentIndex], dp[previousIndex]);
                }
            }
            dp[currentIndex] += cuboids[currentIndex][2];
        }

        return Arrays.stream(dp).max().getAsInt();
    }


}
