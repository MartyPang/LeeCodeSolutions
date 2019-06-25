/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        //if(nums.length == 0) return new int[]{-1-1};
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                int i = mid, j = mid;
                while(i > left && nums[i] == nums[i-1]) --i;
                while(j < right && nums[j] == nums[j+1]) ++j;
                return new int[]{i, j};
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right  = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}

