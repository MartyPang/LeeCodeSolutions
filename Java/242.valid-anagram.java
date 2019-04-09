import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

import org.w3c.dom.css.Counter;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 *
 * https://leetcode.com/problems/valid-anagram/description/
 *
 * algorithms
 * Easy (50.96%)
 * Total Accepted:    319.5K
 * Total Submissions: 620.3K
 * Testcase Example:  '"anagram"\n"nagaram"'
 *
 * Given two strings s and t , write a function to determine if t is an anagram
 * of s.
 * 
 * Example 1:
 * 
 * 
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "rat", t = "car"
 * Output: false
 * 
 * 
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * 
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your
 * solution to such case?
 * 
 */
class Solution {
    // public boolean isAnagram(String s, String t) {
    //     if(s == null || t == null || s.length() != t.length()) return false;
    //     HashMap<Character, Integer> ms = new HashMap<>();
    //     HashMap<Character, Integer> mt = new HashMap<>();
    //     char[] sa = s.toCharArray();
    //     char[] ta = t.toCharArray();
    //     for(int i = 0; i < s.length(); ++i) {
    //         if(ms.containsKey(sa[i])) {
    //             ms.put(sa[i], ms.get(sa[i])+1);
    //         }
    //         else {
    //             ms.put(sa[i], 1);
    //         }
    //         if(mt.containsKey(ta[i])) {
    //             mt.put(ta[i], mt.get(ta[i])+1);
    //         }
    //         else {
    //             mt.put(ta[i], 1);
    //         }
    //     }
    //     return ms.equals(mt);
    // }

    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length()) return false;
        int[] counter = new int[26];
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        for(int i = 0; i < s.length(); ++i) {
            ++counter[sa[i] - 'a'];
            --counter[ta[i] - 'a'];
        }
        for(int j = 0; j < 26; ++j) {
            if(counter[j] != 0) return false;
        }
        return true;
    }
}

