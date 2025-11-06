package org.hobbiesofar.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/pascals-triangle/description/
*/

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        pascalTriangle.add(List.of(1));
        for(int rowIdx = 0; rowIdx < numRows - 1; rowIdx++) {
            ArrayList<Integer> currentRow = new ArrayList();
            currentRow.add(1);
            List<Integer> prevRow = pascalTriangle.get(rowIdx);
            for(int colIdx = 1; colIdx < prevRow.size(); colIdx++) {
                int sum = prevRow.get(colIdx - 1) + prevRow.get(colIdx);
                currentRow.add(sum);
            }
            currentRow.add(1);
            pascalTriangle.add(currentRow);
        }
        return pascalTriangle;
    }
}
