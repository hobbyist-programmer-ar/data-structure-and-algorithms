package org.hobbiesofar.BackTracking;

/*
https://leetcode.com/problems/permutations-ii
*/


class PermutationsII {
    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> currentPermutation = new ArrayList<>();
    private int[] numbers;
    private boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        this.numbers = nums;
        this.used = new boolean[nums.length];

        backtrack(0);
        return result;
    }

    private void backtrack(int currentLength) {
        if(currentLength == numbers.length) {
            result.add(new ArrayList<>(currentPermutation));
            return;
        }

        for(int index = 0; index < numbers.length; index++){
            if(used[index]) {
                continue;
            }

            if(index > 0 && numbers[index] == numbers[index - 1] && !used[index - 1]) {
                continue;
            }

            currentPermutation.add(numbers[index]);
            used[index] = true;

            backtrack(currentLength + 1);

            used[index] = false;
            currentPermutation.remove(currentPermutation.size() - 1);
        }
    }
}
