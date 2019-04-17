/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 *
 * https://leetcode.com/problems/add-digits/description/
 *
 * algorithms
 * Easy (53.53%)
 * Total Accepted:    233.4K
 * Total Submissions: 433.5K
 * Testcase Example:  '38'
 *
 * Given a non-negative integer num, repeatedly add all its digits until the
 * result has only one digit.
 * 
 * Example:
 * 
 * 
 * Input: 38
 * Output: 2 
 * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
 * Since 2 has only one digit, return it.
 * 
 * 
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */
class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;
        int res = 0;
        while(num / 10 > 0) {
            res = 0;
            while(num > 0) {
                res += num % 10;
                num /= 10;
            }
            num = res;
        }
        return res;
    }
}

