/*
 * @lc app=leetcode id=806 lang=java
 *
 * [806] Number of Lines To Write String
 */
class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int lines = 1, cur = 0;
        for(char c : S.toCharArray()) {
            if(cur + widths[c-'a'] > 100) {
                ++lines;
                cur = widths[c-'a'];
            }
            else cur += widths[c-'a'];
        }
        return new int[]{lines, cur};
    }
}

