/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 *
 * https://leetcode.com/problems/max-consecutive-ones/description/
 *
 * algorithms
 * Easy (54.86%)
 * Total Accepted:    133K
 * Total Submissions: 242.2K
 * Testcase Example:  '[1,0,1,1,0,1]'
 *
 * Given a binary array, find the maximum number of consecutive 1s in this
 * array.
 * 
 * Example 1:
 * 
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive
 * 1s.
 * ⁠   The maximum number of consecutive 1s is 3.
 * 
 * 
 * 
 * Note:
 * 
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 * 
 * 
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxone = 0;
        int i = 0;
        int cnt;
        while(i < nums.length) {
            cnt = 0;
            while(i < nums.length && nums[i] == 1) {
                ++cnt;
                ++i;
            }
            maxone = Math.max(cnt, maxone);
            ++i;
        }
        return maxone;
    }
}

