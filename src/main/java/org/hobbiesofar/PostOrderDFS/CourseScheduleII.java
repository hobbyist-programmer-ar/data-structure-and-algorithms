package org.hobbiesofar.PostOrderDFS

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
/*
https://leetcode.com/problems/course-schedule-ii/description/
*/
class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // Create adjacency list to represent the course dependency graph
        // graph[i] contains all courses that depend on course i
        List<Integer>[] graph = new List[numCourses];
        Arrays.setAll(graph, index -> new ArrayList<Integer>());

        // Track the in-degree (number of prerequisites) for each course
        int[] inDegree = new int[numCourses];


        // Build the graph and calculate in-degrees
        // For prerequisite [a, b]: course a depends on course b
        // So we add edge from b to a
        for(int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];
            graph[prerequisiteCourse].add(course);
            inDegree[course]++;
        }
        // Initialize queue with all courses that have no prerequisites (in-degree = 0)
        Deque<Integer> queue = new ArrayDeque<>();
        for(int course = 0; course < numCourses; course++) {
            if(inDegree[course] == 0) {
                queue.offer(course);
            }
        }

        // Store topological order of courses
        int[] courseOrder = new int[numCourses];
        int processedCourses = 0;

        // Process courses using Kahn's algorithm for topological sorting
        while(!queue.isEmpty()) {
            // Take a course with no remaining prerequisites
            int currentCourse = queue.poll();
            courseOrder[processedCourses++] = currentCourse;

            for(int dependentCourse : graph[currentCourse]) {
                inDegree[dependentCourse]--;
                if(inDegree[dependentCourse] == 0) {
                    queue.add(dependentCourse);
                }
            }
        }

        return processedCourses == numCourses ? courseOrder : new int[0];

    }
}
