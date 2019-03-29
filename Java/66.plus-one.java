import java.util.Arrays;

/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 *
 * https://leetcode.com/problems/plus-one/description/
 *
 * algorithms
 * Easy (40.69%)
 * Total Accepted:    356.5K
 * Total Submissions: 875.8K
 * Testcase Example:  '[1,2,3]'
 *
 * Given a non-empty array of digits representing a non-negative integer, plus
 * one to the integer.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list, and each element in the array contain a single digit.
 * 
 * You may assume the integer does not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example 1:
 * 
 * 
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * 
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        if(digits[digits.length-1] + 1 == 10) {
            digits[digits.length-1] = 0;
            carry = 1;
        }
        else {
            digits[digits.length-1] += 1;
        }
        for(int i = digits.length-2; i > -1; --i) {
            if(digits[i] + carry == 10) {
                digits[i] = 0;
                carry = 1;
            }
            else {
                digits[i] += carry;
                carry = 0;
                break;
            }
        }
        if(carry == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for(int i = 1; i < digits.length + 1; ++i) {
                result[i] = digits[i-1];
            }
            return result;
        }
        else {
            return digits;
        }
    }
}

