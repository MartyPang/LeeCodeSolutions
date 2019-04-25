/*
 * @lc app=leetcode id=415 lang=java
 *
 * [415] Add Strings
 *
 * https://leetcode.com/problems/add-strings/description/
 *
 * algorithms
 * Easy (43.03%)
 * Total Accepted:    91.6K
 * Total Submissions: 210.6K
 * Testcase Example:  '"0"\n"0"'
 *
 * Given two non-negative integers num1 and num2 represented as string, return
 * the sum of num1 and num2.
 * 
 * Note:
 * 
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to
 * integer directly.
 * 
 * 
 */
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuffer sb = new StringBuffer("");
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int sum = 0;
        for(; i >= 0 || j >= 0 || carry == 1; --i, --j) {
            sum = (i < 0 ? 0 : num1.charAt(i)-'0') + (j < 0 ? 0 : num2.charAt(j)-'0') + carry;
            carry = sum / 10;
            sum = sum % 10;
            sb.append(sum);
        }
        return sb.reverse().toString();
    }
}

