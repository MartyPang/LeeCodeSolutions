/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */
class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        int l = 0, r = nums.length - 1;
        int min = nums[0];
        int mid;
        while(l <= r) {
            mid = l + (r - l) / 2;
            if(nums[l] <= nums[mid]) {
                min = Math.min(min, nums[l]);
                // search right part
                l = mid + 1;
            } else if(nums[r] >= nums[mid]) {
                min = Math.min(min, nums[mid]);
                r = mid - 1;
            } else {
                if(nums[l] == nums[mid]) ++l;
                if(nums[r] == nums[mid]) --r;
            }
        }
        return min;
    }
}

