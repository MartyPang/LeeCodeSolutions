/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 *
 * https://leetcode.com/problems/maximum-subarray/description/
 *
 * algorithms
 * Easy (42.81%)
 * Total Accepted:    470.4K
 * Total Submissions: 1.1M
 * Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
 *
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example:
 * 
 * 
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 * 
 * Follow up:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 * 
 */
class Solution {
    /**
     * single one pass solution
     * time complexity: O(n)
     * space complexity: O(1)
     */
    // public int maxSubArray(int[] nums) {
    //     if(nums.length == 0) return 0;
    //     int cursum = 0;
    //     int maxsum = Integer.MIN_VALUE;
    //     for(int i = 0; i < nums.length; ++i) {
    //         cursum += nums[i];
    //         cursum = cursum < nums[i] ? nums[i] : cursum;
    //         maxsum = maxsum < cursum ? cursum : maxsum;
    //     }
    //     return maxsum;
    // }

    /**
     * divide and conquer approach
     * time complexity: O(nlogn)
     */
    // public int maxSubArray(int[] nums) {
    //     return subArraySum(nums, 0, nums.length-1);
    // }

    // private int subArraySum(int[] nums, int left, int right) {
    //     if(left > right) return 0;
    //     if(left == right) return nums[left];
    //     int mid = left + (right - left) / 2;
    //     int lmax = subArraySum(nums, left, mid);
    //     int rmax = subArraySum(nums, mid + 1, right);

    //     int maxleft = Integer.MIN_VALUE, maxright = Integer.MIN_VALUE;
    //     for(int i = mid, sum = 0; i >= left; --i) {
    //         sum += nums[i];
    //         maxleft = maxleft < sum ? sum : maxleft;
    //     }
    //     for(int i = mid + 1, sum = 0; i <= right; ++i) {
    //         sum += nums[i];
    //         maxright = maxright < sum ? sum : maxright;
    //     }
    //     return Math.max(Math.max(lmax, rmax), maxleft+maxright);
    // }

    /**
     * dynamic programming
     */
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; ++i) {
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
        }
        int max = dp[0];
        for(int i = 1; i < dp.length; ++i) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}

