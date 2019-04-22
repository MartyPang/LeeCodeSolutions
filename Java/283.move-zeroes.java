/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 *
 * https://leetcode.com/problems/move-zeroes/description/
 *
 * algorithms
 * Easy (53.63%)
 * Total Accepted:    448.8K
 * Total Submissions: 830.3K
 * Testcase Example:  '[0,1,0,3,12]'
 *
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * 
 * Example:
 * 
 * 
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * 
 * Note:
 * 
 * 
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * 
 */
class Solution {
    public void moveZeroes(int[] nums) {
        //bubble sort
        // for(int i = 0; i < nums.length; ++i) {
        //     for(int j = 0; j < nums.length - i -1; ++j) {
        //         if(nums[j] == 0) {
        //             nums[j] ^= nums[j+1];
        //             nums[j+1] ^= nums[j];
        //             nums[j] ^= nums[j+1];
        //         }
        //     }
        // }

        for(int last = 0, cur = 0; cur < nums.length; ++cur) {
            if(nums[cur] != 0) {
                // nums[last] ^= nums[cur];
                // nums[cur] ^= nums[last];
                // nums[last] ^= nums[cur];
                int tmp = nums[cur];
                nums[cur] = nums[last];
                nums[last] = tmp;
                ++last;
            }
        }
    }
}

