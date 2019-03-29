/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 *
 * https://leetcode.com/problems/search-insert-position/description/
 *
 * algorithms
 * Easy (40.46%)
 * Total Accepted:    364.4K
 * Total Submissions: 900.5K
 * Testcase Example:  '[1,3,5,6]\n5'
 *
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Example 1:
 * 
 * 
 * Input: [1,3,5,6], 5
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [1,3,5,6], 2
 * Output: 1
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: [1,3,5,6], 7
 * Output: 4
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: [1,3,5,6], 0
 * Output: 0
 * 
 * 
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        if(high < 0) return 0;
        while(low <= high) {
            int m = (low + high) / 2;
            if(nums[m] == target) {
                return m;
            }
            else if(nums[m] > target) {
                high = m-1;
            }
            else {
                low = m+1;
            }
        }
        return low;
    }

    // public int binarySearch(int[] array, int low, int high, int target) {
    //     if(low <= high) {
    //         int mid = (low + high) / 2;
    //         if(array[mid] == target) {
    //             return mid;
    //         }
    //         else if(array[mid] > target) {
    //             return binarySearch(array, low, mid - 1, target);
    //         }
    //         else {
    //             return binarySearch(array, mid + 1, high, target); 
    //         }
    //     }
    //     else {
    //         return -1;
    //     }
    // }
}

