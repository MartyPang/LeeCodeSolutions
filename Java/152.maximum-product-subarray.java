/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */
class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int maxP = nums[0];
        int minP = nums[0];
        int res = nums[0];
        for(int i = 1; i < nums.length; ++i) {
            int tmp = maxP;
            maxP = Math.max(Math.max(maxP*nums[i], minP*nums[i]), nums[i]);
            minP = Math.min(Math.min(tmp*nums[i], minP*nums[i]), nums[i]);
            res = Math.max(maxP, res);
        }
        return res;
    }
}

