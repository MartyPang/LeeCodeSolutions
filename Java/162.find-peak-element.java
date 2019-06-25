/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 */
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        int i = 0;
        for(; i < nums.length -1; ++i) {
            if(nums[i] > nums[i+1]) return i;
        }
        return nums.length - 1;
    }
}

