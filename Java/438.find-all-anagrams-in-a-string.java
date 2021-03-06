import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 *
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
 *
 * algorithms
 * Easy (36.41%)
 * Total Accepted:    117.9K
 * Total Submissions: 318.4K
 * Testcase Example:  '"cbaebabacd"\n"abc"'
 *
 * Given a string s and a non-empty string p, find all the start indices of p's
 * anagrams in s.
 * 
 * Strings consists of lowercase English letters only and the length of both
 * strings s and p will not be larger than 20,100.
 * 
 * The order of output does not matter.
 * 
 * Example 1:
 * 
 * Input:
 * s: "cbaebabacd" p: "abc"
 * 
 * Output:
 * [0, 6]
 * 
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of
 * "abc".
 * 
 * 
 * 
 * Example 2:
 * 
 * Input:
 * s: "abab" p: "ab"
 * 
 * Output:
 * [0, 1, 2]
 * 
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 * 
 * 
 */
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s.length() < p.length()) return result;
        char[] sa = s.toCharArray();
        char[] pa = p.toCharArray();
        for(int i = 0; i < s.length() - p.length() + 1; ++i) {
            if(isAnagram(sa, i, i+p.length()-1, pa)) result.add(i);
        }
        return result;
    }

    private boolean isAnagram(char[] s, int start, int end, char[] p) {
        int[] table = new int[26];
        for(int i = 0; i < p.length; ++i) table[p[i]-'a']++;
        for(int j = start; j <= end; ++j) {
            //table[s[j]-'a']--;
            if(--table[s[j]-'a'] < 0) return false;
        }
        return true;
    }
}

