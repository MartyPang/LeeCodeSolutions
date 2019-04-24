/*
 * @lc app=leetcode id=400 lang=java
 *
 * [400] Nth Digit
 *
 * https://leetcode.com/problems/nth-digit/description/
 *
 * algorithms
 * Easy (30.09%)
 * Total Accepted:    46.3K
 * Total Submissions: 153.3K
 * Testcase Example:  '3'
 *
 * Find the n^th digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8,
 * 9, 10, 11, ... 
 * 
 * Note:
 * n is positive and will fit within the range of a 32-bit signed integer (n <
 * 2^31).
 * 
 * 
 * Example 1:
 * 
 * Input:
 * 3
 * 
 * Output:
 * 3
 * 
 * 
 * 
 * Example 2:
 * 
 * Input:
 * 11
 * 
 * Output:
 * 0
 * 
 * Explanation:
 * The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a
 * 0, which is part of the number 10.
 * 
 * 
 */
class Solution {
    public int findNthDigit(int n) {
        int digits = 1;
        long interval = digits * 9 * (long)Math.pow(10, digits - 1);
        int start = 1;
        while(n > interval) {
            n -= interval;
            ++digits;
            interval = digits * 9 * (long)Math.pow(10, digits - 1);
            start *= 10;
        }
        int number = start + (n - 1) / digits;
        String s = Integer.toString(number);
        return Character.getNumericValue(s.charAt((n - 1) % digits));   
    }
}

