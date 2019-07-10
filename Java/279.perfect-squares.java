/*
 * @lc app=leetcode id=279 lang=java
 *
 * [279] Perfect Squares
 */
class Solution {
    public int numSquares(int n) {
        if(n == 0) return 0;
        int[] dp = new int[n+1];
        dp[0] = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n+1; ++i) {
            min = Integer.MAX_VALUE;
            for(int j = 1; j*j <= i; ++j) {
                min = Math.min(min, dp[i-j*j]+1);
            }
            dp[i] = min;
        }
        return dp[n];
    }
}

