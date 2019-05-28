/*
 * @lc app=leetcode id=674 lang=java
 *
 * [674] Longest Continuous Increasing Subsequence
 */
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length <= 1) return nums.length;
        int len = 1;
        int max_len = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length; ++i) {
            if(nums[i] > nums[i-1]) {
                ++len;
            }
            else {
                max_len = Math.max(len, max_len);
                len = 1;
            }
        }
        return max_len < len ? len : max_len;
    }
}

