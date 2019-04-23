import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 *
 * https://leetcode.com/problems/ransom-note/description/
 *
 * algorithms
 * Easy (49.28%)
 * Total Accepted:    108.2K
 * Total Submissions: 218.2K
 * Testcase Example:  '"a"\n"b"'
 *
 * 
 * Given an arbitrary ransom note string and another string containing letters
 * from all the magazines, write a function that will return true if the
 * ransom 
 * note can be constructed from the magazines ; otherwise, it will return
 * false. 
 * 
 * 
 * Each letter in the magazine string can only be used once in your ransom
 * note.
 * 
 * 
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * 
 * 
 * 
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * 
 * 
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        if(ransomNote.isEmpty() && magazine.isEmpty()) return true;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : ransomNote.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }
            else map.put(c, 1);
        }

        for(char c : magazine.toCharArray()) {
            if(map.containsKey(c)) {
                int cnt = map.get(c);
                if(--cnt == 0) map.remove(c);
                else map.put(c, cnt);
            }
            if(map.isEmpty()) return true;
        }
        return false;
    }
}

