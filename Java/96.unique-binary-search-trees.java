/*
 * @lc app=leetcode id=96 lang=java
 *
 * [96] Unique Binary Search Trees
 */
class Solution {
    public int numTrees(int n) {
        if(n <= 1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; ++i) {
            int cnt = 0;
            //pick j as the root
            for(int j = 1; j <= i; ++j) {
                cnt += dp[j-1]*dp[i-j];
            }
            dp[i] = cnt;
        }
        return dp[n];
    }
}

