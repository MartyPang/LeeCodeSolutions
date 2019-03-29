/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (25.13%)
 * Total Accepted:    615.4K
 * Total Submissions: 2.4M
 * Testcase Example:  '123'
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * 
 * Input: 123
 * Output: 321
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -123
 * Output: -321
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 120
 * Output: 21
 * 
 * 
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose
 * of this problem, assume that your function returns 0 when the reversed
 * integer overflows.
 * 
 */
class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while(x != 0) {
            //运算前先判断是否会越界
            int last = x % 10;
            x /= 10;
            //reverse*10或者reverse*10+last溢出上界
            if(Integer.MAX_VALUE/10 < reverse || (Integer.MAX_VALUE/10 == reverse && 7 < last)) {
                return 0;
            }
            //reverse*10或者reverse*10+last溢出下界
            else if(Integer.MIN_VALUE/10 > reverse || (Integer.MIN_VALUE/10 == reverse && -8 > last)) {
                return 0;
            }
            reverse = reverse*10 + last;
        }
        return reverse;
    }
}

