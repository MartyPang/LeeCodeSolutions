/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();
        int[] table = new int[256];
        char[] sa = s.toCharArray();
        int l = 0, r = 0, len = 1;
        for(; r < s.length(); ++r) {
            table[sa[r]]++;
            while(table[sa[r]] != 1) {
                table[sa[l]] --;
                ++l;
            }
            len = Math.max(len, r-l+1);
        }
        return len;
    }
}

