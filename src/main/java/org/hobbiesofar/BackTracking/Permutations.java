package org.hobbiesofar.BackTracking

import java.util.ArrayList;
import java.util.List;


/*
https://leetcode.com/problems/permutations/
*/
class Permutations {
    private List<List<Integer>> result = new ArrayList<>();
        private List<Integer> currentPermutations = new ArrayList<>();
        private boolean[] visited;
        private int[] numbers;
        public List<List<Integer>> permute(int[] nums) {
            this.numbers = nums;
            this.visited = new boolean[nums.length];
            backtrack(0);
            return result;
        }

        private void backtrack(int depth) {
            if(depth == numbers.length) {
                result.add(new ArrayList<>(currentPermutations));
                return;
            }

            for(int i = 0; i < numbers.length; i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    currentPermutations.add(numbers[i]);
                    backtrack(depth + 1);

                    currentPermutations.remove(currentPermutations.size() - 1);
                    visited[i] = false;
                }
            }
        }
}
