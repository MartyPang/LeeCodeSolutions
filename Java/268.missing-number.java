/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 *
 * https://leetcode.com/problems/missing-number/description/
 *
 * algorithms
 * Easy (47.56%)
 * Total Accepted:    264K
 * Total Submissions: 549.8K
 * Testcase Example:  '[3,0,1]'
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 * 
 * Example 1:
 * 
 * 
 * Input: [3,0,1]
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * 
 * 
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement
 * it using only constant extra space complexity?
 */
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int all = (n+1) * n / 2;
        int sum = 0;
        for(int i = 0; i < n; ++i) {
            sum += nums[i];
        }
        return all - sum;
    }
}

