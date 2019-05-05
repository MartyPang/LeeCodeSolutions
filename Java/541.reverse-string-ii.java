/*
 * @lc app=leetcode id=541 lang=java
 *
 * [541] Reverse String II
 */
class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        for(; i <= s.length(); i = j) {
            j = i + k <= s.length() ? i + k : s.length();
            for(int tmp = j - 1; tmp >= i; --tmp) {
                sb.append(s.charAt(tmp));
            }
            if(j == s.length()) break;

            i = j;
            j = i + k <= s.length() ? i + k : s.length();
            sb.append(s.substring(i, j));
        }
        // if(i == 0) {
        //     sb.append(s).reverse();
        // }
        // else if (i < s.length()) {
        //     for(; i < s.length(); ++i) sb.append(s.charAt(i));
        // }
        return sb.toString();
    }
}

