/*
 * @lc app=leetcode id=459 lang=java
 *
 * [459] Repeated Substring Pattern
 *
 * https://leetcode.com/problems/repeated-substring-pattern/description/
 *
 * algorithms
 * Easy (39.71%)
 * Total Accepted:    77.8K
 * Total Submissions: 195.8K
 * Testcase Example:  '"abab"'
 *
 * Given a non-empty string check if it can be constructed by taking a
 * substring of it and appending multiple copies of the substring together. You
 * may assume the given string consists of lowercase English letters only and
 * its length will not exceed 10000.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: "abab"
 * Output: True
 * Explanation: It's the substring "ab" twice.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "aba"
 * Output: False
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "abcabcabcabc"
 * Output: True
 * Explanation: It's the substring "abc" four times. (And the substring
 * "abcabc" twice.)
 * 
 * 
 */
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int divider = len / 2; divider > 0; --divider) {
            if(len % divider == 0) {
                int times = len /divider;
                String substr = s.substring(0, divider);
                StringBuilder sb = new StringBuilder(substr);
                for(int i = 1; i < times; ++i) sb.append(substr);
                if(s.equals(sb.toString())) return true;
            }
        }
        return false;
    }
}

