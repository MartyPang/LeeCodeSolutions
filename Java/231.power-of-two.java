/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 *
 * https://leetcode.com/problems/power-of-two/description/
 *
 * algorithms
 * Easy (41.63%)
 * Total Accepted:    219.7K
 * Total Submissions: 525.9K
 * Testcase Example:  '1'
 *
 * Given an integer, write a function to determine if it is a power of two.
 * 
 * Example 1:
 * 
 * 
 * Input: 1
 * Output: true 
 * Explanation: 2^0 = 1
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 16
 * Output: true
 * Explanation: 2^4 = 16
 * 
 * Example 3:
 * 
 * 
 * Input: 218
 * Output: false
 * 
 */
class Solution {
    /**
     * Iterative
     */
    // public boolean isPowerOfTwo(int n) {
    //     if(n == 1) return true;
    //     long power = 1;
    //     while(power < n) {
    //         power *= 2;
    //         if(power == n) return true;
    //     }
    //     return false;
    // }

    /**
     * Bit manipulation
     */
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        return (n&(n-1)) == 0;
    }
}

