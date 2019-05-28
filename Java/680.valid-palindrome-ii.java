/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */
class Solution {
    // public boolean validPalindrome(String s) {
    //     if(s.length() <= 1) return true;
    //     int left = 0, right = s.length() - 1;
    //     boolean detete = false;
    //     while(left < right) {
    //         if(s.charAt(left) == s.charAt(right)) {
    //             ++left;
    //             --right;
    //         }
    //         else if(detete) {
    //             return false;
    //         }
    //         else {
    //             if(s.charAt(left+1) == s.charAt(right)) {
    //                 ++left;
    //                 detete = true;
    //             }
    //             else if(s.charAt(right-1) == s.charAt(left)) {
    //                 --right;
    //                 detete = true;
    //             }
    //             else {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    public boolean validPalindrome(String s) {
        if(s.length() <= 1) return true;
        int left = 0, right = s.length() - 1;
        char[] c = s.toCharArray();
        boolean detete = false;
        return helper(c, left, right, detete);
    }

    private boolean helper(char[] c, int left, int right, boolean detete) {
        if(left >= right) return true;
        if(c[left] == c[right]) {
            return helper(c, left+1, right-1, detete);
        }
        else if(!detete) {
            return helper(c, left+1, right, !detete) || helper(c, left, right-1, !detete);
        }
        else {
            return false;
        }
    }
}

