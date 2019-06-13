/*
 * @lc app=leetcode id=796 lang=java
 *
 * [796] Rotate String
 */
class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length() != B.length()) return false;
        int i = 1;
        for(; i <= B.length(); ++i) {
            if(A.indexOf(B.substring(0, i)) == -1) break;
        }
        return A.indexOf(B.substring(i-1, B.length())) >= 0;
    }
}

