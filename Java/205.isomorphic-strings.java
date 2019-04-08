import java.util.HashMap;

/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 *
 * https://leetcode.com/problems/isomorphic-strings/description/
 *
 * algorithms
 * Easy (36.73%)
 * Total Accepted:    194.1K
 * Total Submissions: 525.1K
 * Testcase Example:  '"egg"\n"add"'
 *
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * 
 * Example 1:
 * 
 * 
 * Input: s = "egg", t = "add"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "foo", t = "bar"
 * Output: false
 * 
 * Example 3:
 * 
 * 
 * Input: s = "paper", t = "title"
 * Output: true
 * 
 * Note:
 * You may assume both s and t have the same length.
 * 
 */
class Solution {
    /**
     * HashMap
     */
    // public boolean isIsomorphic(String s, String t) {
    //     if(s == null || s.isEmpty()) return true;
    //     int p = 0;
    //     HashMap<Character, Character> map = new HashMap<>();
    //     while(p < s.length()) {
    //         if(map.containsKey(s.charAt(p))) {
    //             if(!map.get(s.charAt(p)).equals(t.charAt(p))) return false;
    //         }
    //         else {
    //             if(!map.containsValue(t.charAt(p))) {
    //                 map.put(s.charAt(p), t.charAt(p));
    //             }
    //             else return false;
    //         }
    //         ++p;
    //     }
    //     return true;
    // }

    /**
     * char array
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.isEmpty()) return true;
        int p = 0;
        char[] sa = new char[256];
        char[] ta = new char[256];
        while(p < s.length()) {
            char sc = s.charAt(p);
            char tc = t.charAt(p);
            if(sa[sc] == 0 && ta[tc] == 0) {
                sa[sc] = tc;
                ta[tc] = sc;
            }
            else {
                if(sa[sc] != tc || ta[tc] != sc) return false;
            }
            ++p;
        }
        return true;
    }
}

