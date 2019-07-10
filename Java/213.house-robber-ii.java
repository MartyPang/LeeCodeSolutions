/*
 * @lc app=leetcode id=213 lang=java
 *
 * [213] House Robber II
 */
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int prevprev = 0;
        int prev = nums[0];
        int res1 = nums[0];
        for(int i = 1; i < nums.length-1; ++i) {
            res1 = Math.max(prevprev + nums[i], prev);
            prevprev = prev;
            prev = res1;
        }
        prevprev = 0;
        prev = nums[1];
        int res2 = nums[1];
        for(int i = 2; i < nums.length; ++i) {
            res2 = Math.max(prevprev + nums[i], prev);
            prevprev = prev;
            prev = res2;
        }
        return Math.max(res1, res2);
    }
}

