/*
 * @lc app=leetcode id=824 lang=java
 *
 * [824] Goat Latin
 */
class Solution {
    public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        String[] words = S.split(" ");
        for(int i = 0; i < words.length; ++i) {
            if(Character.toLowerCase(words[i].charAt(0)) == 'a' ||
            Character.toLowerCase(words[i].charAt(0)) == 'e' || 
            Character.toLowerCase(words[i].charAt(0)) == 'i' ||
            Character.toLowerCase(words[i].charAt(0)) == 'o' ||
            Character.toLowerCase(words[i].charAt(0)) == 'u') {
                sb.append(words[i]).append("ma");
            }
            else {
                sb.append(words[i].substring(1));
                sb.append(words[i].charAt(0)).append("ma");
            }
            for(int k = 0; k <= i; ++k) sb.append('a');
            if(i != words.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}

