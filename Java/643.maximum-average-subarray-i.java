/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0.0;
        int i = 0;
        for(; i < k; ++i) {
            max += nums[i];
        }
        double sum = max;
        for(; i < nums.length; ++i) {
            sum += nums[i] - nums[i-k];
            max = Math.max(sum, max);
        }
        return max/k;
    }
}

