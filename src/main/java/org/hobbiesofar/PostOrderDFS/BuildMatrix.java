package org.hobbiesofar.PostOrderDFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/*
https://leetcode.com/problems/build-a-matrix-with-conditions
*/

class BuildMatrix {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        List<Integer> rowOrder = topologicalSort(k, rowConditions);
        List<Integer> colOrder = topologicalSort(k, colConditions);

        if(rowOrder == null || colOrder == null) {
            return new int[0][0];
        }

        int[][] resultMatrix = new int[k][k];
        int[] valToColIndex = new int[k+1];

        for (int i = 0; i < k; i++) {
            valToColIndex[colOrder.get(i)] = i;
        }

        for(int rowIdx = 0; rowIdx < k; rowIdx++) {
            int value = rowOrder.get(rowIdx);
            int colIdx = valToColIndex[value];
            resultMatrix[rowIdx][colIdx] = value;
        }

        return resultMatrix;
    }

    private List<Integer> topologicalSort(int k, int[][] conditions) {
        List<Integer>[] graph = new List[k+1];
        Arrays.setAll(graph, index -> new ArrayList<>());

        int[] inDegree = new int[k+1];

        for(int[] condition : conditions) {
            int from = condition[0];
            int to = condition[1];
            graph[from].add(to);
            inDegree[to]++;
        }

        Deque<Integer> queue = new ArrayDeque<Integer>();
        for(int node = 1; node <= k; node++) {
            if(inDegree[node] == 0) {
                queue.offer(node);
            }
        }

        List<Integer> sortedOrder = new ArrayList<Integer>();
        while(!queue.isEmpty()) {

            int levelSize = queue.size();
            for(int i = 0; i < levelSize; i++) {
                int currentNode = queue.pollFirst();
                sortedOrder.add(currentNode);

                for(int neighbour : graph[currentNode]) {
                    inDegree[neighbour]--;
                    if(inDegree[neighbour] ==  0) {
                        queue.add(neighbour);
                    }
                }
            }
        }

        return sortedOrder.size() == k ? sortedOrder : null;
    }
}
