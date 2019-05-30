/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */
class Solution {
    /**
     * prefix sum
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        if(nums.length == 0) return -1;
        int sum = 0;
        for(int n : nums) sum += n;

        int tmp = 0;
        for(int i = 0; i < nums.length; ++i) {
            if(tmp == sum - tmp - nums[i]) return i;
            tmp += nums[i];
        }

        return -1;
    }
}

