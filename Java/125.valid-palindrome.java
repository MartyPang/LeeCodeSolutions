/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 *
 * https://leetcode.com/problems/valid-palindrome/description/
 *
 * algorithms
 * Easy (30.24%)
 * Total Accepted:    331.4K
 * Total Submissions: 1.1M
 * Testcase Example:  '"A man, a plan, a canal: Panama"'
 *
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * 
 * Note: For the purpose of this problem, we define empty string as valid
 * palindrome.
 * 
 * Example 1:
 * 
 * 
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "race a car"
 * Output: false
 * 
 * 
 */
class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        String lower = s.trim().toLowerCase();
        int left = 0, right = lower.length()-1;
        boolean result = true;
        while(left <= right) {
            while(left < lower.length() && !isAlphanumeric(lower.charAt(left))) ++left;
            while(right > 0 && !isAlphanumeric(lower.charAt(right))) --right;
            if(left > right) break;
            if(lower.charAt(left) != lower.charAt(right)) {
                result = false;
                break;
            }
            ++left;
            --right;
        }
        return result;
    }

    public boolean isAlphanumeric(char a) {
        if('a' <= a && a <= 'z' || '0' <= a && a <= '9') return true;
        return false;
    }
}

