/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */
class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int prevLen = 0;
        int res = 0;
        for(int i = 1; i < nums.length; ++i) {
            prevLen = 0;
            for(int j = 0; j < i; ++j) {
                if(nums[j] < nums[i]) {
                    prevLen = Math.max(dp[j], prevLen);
                }
            }
            dp[i] = prevLen + 1;
            res = Math.max(dp[i], res);
        }
        return res;
    }
}

