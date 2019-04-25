/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 *
 * https://leetcode.com/problems/longest-palindrome/description/
 *
 * algorithms
 * Easy (47.45%)
 * Total Accepted:    94K
 * Total Submissions: 196.6K
 * Testcase Example:  '"abccccdd"'
 *
 * Given a string which consists of lowercase or uppercase letters, find the
 * length of the longest palindromes that can be built with those letters.
 * 
 * This is case sensitive, for example "Aa" is not considered a palindrome
 * here.
 * 
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * 
 * 
 * Example: 
 * 
 * Input:
 * "abccccdd"
 * 
 * Output:
 * 7
 * 
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 * 
 * 
 */
class Solution {
    public int longestPalindrome(String s) {
        if(s.isEmpty()) return 0;
        int[] table = new int[52];
        int res = 0;
        for(char c : s.toCharArray()) {
            if(Character.isUpperCase(c)) table[c-'A']++;
            else table[c-'a'+26]++;
        }
        int maxOdd = 0;
        for(int i = 0; i < 52; ++i) {
            if(table[i] != 0 && table[i] % 2 == 0) {
                res += table[i];
            }
            else if(table[i] % 2 == 1) {
                res += table[i] - 1;
                if(table[i] > maxOdd) maxOdd = table[i];
            }
        }
        return res + (maxOdd == 0 ? 0 : 1);
    }
}

