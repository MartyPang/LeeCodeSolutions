/*
 * @lc app=leetcode id=81 lang=java
 *
 * [81] Search in Rotated Sorted Array II
 */
class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;
        int left = 0, right = nums.length-1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return true;
            // left part in order
            if(nums[left] < nums[mid]) {
                if(nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if(nums[right] > nums[mid]) {
                if(nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if(nums[left] == nums[mid]) ++left;
                if(nums[right] == nums[mid]) --right;
            }
        }
        return false;
    }
}

