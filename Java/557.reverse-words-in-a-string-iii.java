/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        for(; i < words.length; ++i) {
            for(j = words[i].length() - 1; j >= 0; --j) {
                sb.append(words[i].charAt(j));
            }
            if(i != words.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}

