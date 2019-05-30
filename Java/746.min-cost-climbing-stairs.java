/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] d = new int[cost.length + 1];
        d[1] = cost[0];
        d[2] = cost[1];
        for(int i = 3; i < cost.length+1; ++i) {
            d[i] = Math.min(d[i-1], d[i-2]) + cost[i-1];
        }
        return Math.min(d[cost.length], d[cost.length-1]);
    }
}

