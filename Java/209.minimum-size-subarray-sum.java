/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */
class Solution {
    /**
     * Two pointer
     */
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0) return 0;
        int l = 0, r = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while(r < nums.length) {
            sum += nums[r];
            while(sum >= s) {
                ans = Math.min(ans, r - l + 1);
                sum -= nums[l++];
            }
            ++r;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}

