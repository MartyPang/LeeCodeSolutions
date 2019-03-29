/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 *
 * https://leetcode.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (37.96%)
 * Total Accepted:    278.3K
 * Total Submissions: 732K
 * Testcase Example:  '"11"\n"1"'
 *
 * Given two binary strings, return their sum (also a binary string).
 * 
 * The input strings are both non-empty and contains only characters 1 or 0.
 * 
 * Example 1:
 * 
 * 
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 * Example 2:
 * 
 * 
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * 
 */
class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int i = a.length()-1, j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0) {
            if(i >= 0) {
                carry += a.charAt(i) - '0';    
            }
            if(j>= 0) {
                carry += b.charAt(j) - '0';
            }
            result = carry % 2 + result;
            carry = carry / 2; 
            --i;
            --j;
        }
        if(carry != 0) {
            result = 1 + result;
        }
        return result;
    }
}

