import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/*
 * @lc app=leetcode id=210 lang=java
 *
 * [210] Course Schedule II
 */
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        List<Integer>[] graph = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; ++i) {
            graph[i] = new ArrayList<>();
        }
        int[] degree = new int[numCourses];
        buildGraph(graph, degree, prerequisites);
        //run BFS
        Queue<Integer> queue = new LinkedList<>();
        int cnt = 0;
        for(int i = 0; i < numCourses; ++i) {
            if(degree[i] == 0) {
                queue.offer(i);
                res[cnt++] = i;
            }
        }

        while(!queue.isEmpty()) {
            int course = queue.poll();
            for(int p : graph[course]) {
                if(--degree[p] == 0) {
                    queue.offer(p);
                    res[cnt++] = p;
                }
            }
        }
        return cnt == numCourses ? res : new int[0];
    }

    private void buildGraph(List<Integer>[] graph, int[] degree, int[][] pre) {
        for(int i = 0; i < pre.length; ++i) {
            // inverse edge
            graph[pre[i][1]].add(pre[i][0]);
            degree[pre[i][0]]++;
        }
   }
}

