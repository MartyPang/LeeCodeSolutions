import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=500 lang=java
 *
 * [500] Keyboard Row
 *
 * https://leetcode.com/problems/keyboard-row/description/
 *
 * algorithms
 * Easy (61.99%)
 * Total Accepted:    86.6K
 * Total Submissions: 139.6K
 * Testcase Example:  '["Hello","Alaska","Dad","Peace"]'
 *
 * Given a List of words, return the words that can be typed using letters of
 * alphabet on only one row's of American keyboard like the image
 * below.
 * 
 * 
 * 
 * 
 * 
 * 
 * Example:
 * 
 * 
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 * 
 * 
 */
class Solution {
    public String[] findWords(String[] words) {
        String[] tables = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < tables.length; ++i) {
            for(char c : tables[i].toCharArray()) map.put(c, i);
        }
        List<String> res = new ArrayList<>();
        for(String word : words) {
            int row = map.get(word.toLowerCase().charAt(0));
            for(char c : word.toLowerCase().toCharArray()) {
                if(row != map.get(c)) {
                    row = -1;
                    break;
                }
            }
            if(row != -1) {
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }
}

