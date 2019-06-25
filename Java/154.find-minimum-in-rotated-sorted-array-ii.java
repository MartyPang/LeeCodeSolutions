/*
 * @lc app=leetcode id=154 lang=java
 *
 * [154] Find Minimum in Rotated Sorted Array II
 */
class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        int l = 0, r = nums.length - 1;
        int mid;
        while(l <= r) {
            mid = l + (r - l) / 2;
            if(nums[mid] > nums[r]) {
                l = mid + 1;
            } else if(nums[mid] < nums[r]) {
                r = mid;
            } else {
                --r;
            }
        }
        return nums[l];
    }
}

