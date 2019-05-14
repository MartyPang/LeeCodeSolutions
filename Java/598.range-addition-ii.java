/*
 * @lc app=leetcode id=598 lang=java
 *
 * [598] Range Addition II
 */
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0) return m*n;
        int minX = 40002, minY = 40002;
        for(int i = 0; i < ops.length; ++i) {
            minX = Math.min(minX, ops[i][0]);
            minY = Math.min(minY, ops[i][1]);
        }
        return minX*minY;
    }
}

