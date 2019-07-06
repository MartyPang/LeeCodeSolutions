/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */
class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 2) return s;
        int minIndex = 0, maxLen = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        // for(int i = s.length()-1; i >= 0; --i) {
        //     for(int j = i; j < s.length(); ++j) {
        //         dp[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i < 3 || dp[i+1][j-1]);
        //         if(dp[i][j] && j-i+1 > maxLen) {
        //             maxLen = j-i+1;
        //             minIndex = i;
        //         }
        //     }
        // }
        for(int i = 0; i < s.length(); ++i) {
            for(int j = 0; j <= i; ++j) {
                dp[j][i] = s.charAt(j) == s.charAt(i) && (i - j < 3 || dp[j+1][i-1]);
                if(dp[j][i] && i - j + 1 > maxLen) {
                    maxLen = i - j + 1;
                    minIndex = j;
                }
            }
        }
        return s.substring(minIndex, minIndex+maxLen);
    }
}

