/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 *
 * https://leetcode.com/problems/valid-perfect-square/description/
 *
 * algorithms
 * Easy (39.40%)
 * Total Accepted:    106K
 * Total Submissions: 267.4K
 * Testcase Example:  '16'
 *
 * Given a positive integer num, write a function which returns True if num is
 * a perfect square else False.
 * 
 * Note: Do not use any built-in library function such as sqrt.
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: 16
 * Output: true
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 14
 * Output: false
 * 
 * 
 * 
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1, right = num;
        while(left <= right) {
            long mid = left + (right - left) / 2;
            if(mid * mid < num) {
                left = (int) mid + 1;
            }
            else if(mid * mid > num) {
                right = (int) mid - 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}

