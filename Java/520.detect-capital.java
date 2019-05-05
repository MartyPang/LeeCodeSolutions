/*
 * @lc app=leetcode id=520 lang=java
 *
 * [520] Detect Capital
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        int upper = 0;
        for(char c : word.toCharArray()) {
            if(Character.isUpperCase(c)) ++upper;
        }
        if(upper == 1) return Character.isUpperCase(word.charAt(0));
        return upper == 0 || upper == word.length();
    }
}

