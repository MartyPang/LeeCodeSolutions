import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode id=207 lang=java
 *
 * [207] Course Schedule
 */
class Solution {
    /**
     * BFS + Topological sort
     * @param numCourses
     * @param prerequisites
     * @return
     */
    // public boolean canFinish(int numCourses, int[][] prerequisites) {
    //     List<Integer>[] graph = new ArrayList[numCourses];
    //     for(int i = 0; i < numCourses; ++i) {
    //         graph[i] = new ArrayList<>();
    //     }
    //     //in-degree
    //     int[] degree = new int[numCourses];
    //     buildGraph(graph, degree, prerequisites);

    //     int cnt = 0;
    //     Queue<Integer> queue = new LinkedList<>();
    //     for(int i = 0; i < numCourses; ++i) {
    //         if(degree[i] == 0) {
    //             queue.offer(i);
    //             ++cnt;
    //         }
    //     }

    //     while(!queue.isEmpty()) {
    //         int course = queue.poll();
    //         for(int p : graph[course]) {
    //             //degree[p]--;
    //             if(--degree[p] == 0) {
    //                 queue.offer(p);
    //                 ++cnt;
    //             }
    //         }
    //     }

    //     return cnt == numCourses;
    // }

    private void buildGraph(List[] graph, int[] degree, int[][] pre) {
         for(int i = 0; i < pre.length; ++i) {
             graph[pre[i][0]].add(pre[i][1]);
             degree[pre[i][1]]++;
         }
    }

    /**
     * DFS detect cycle
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; ++i) {
            graph[i] = new ArrayList<>();
        }

        boolean[] visited = new boolean[numCourses];
        for(int i = 0; i < prerequisites.length; ++i) {
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        for(int i = 0; i < numCourses; ++i) {
            if(!dfs(graph, visited, i)) return false;
        }

        return true;
    }

    private boolean dfs(List<Integer>[] graph, boolean[] visited, int course) {
        //detect a cycle
        if(visited[course]) return false;
        visited[course] = true;

        for(int p : graph[course]) {
            if(!dfs(graph, visited, p)) return false;
        }
        //backtrack
        visited[course] = false;
        return true;
    }
}

