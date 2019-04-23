/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 *
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 *
 * algorithms
 * Easy (49.20%)
 * Total Accepted:    254.3K
 * Total Submissions: 511.5K
 * Testcase Example:  '"leetcode"'
 *
 * 
 * Given a string, find the first non-repeating character in it and return it's
 * index. If it doesn't exist, return -1.
 * 
 * Examples:
 * 
 * s = "leetcode"
 * return 0.
 * 
 * s = "loveleetcode",
 * return 2.
 * 
 * 
 * 
 * 
 * Note: You may assume the string contain only lowercase letters.
 * 
 */
class Solution {
    public int firstUniqChar(String s) {
        int[] table = new int[26];
        for(char c : s.toCharArray()) {
            table[c - 'a']++;
        }
        for(int i = 0; i < s.length(); ++i) {
            if(table[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
        
    }
}

