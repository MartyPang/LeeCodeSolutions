import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=804 lang=java
 *
 * [804] Unique Morse Code Words
 */
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            sb.delete(0, sb.length());
            for(char c : word.toCharArray()) {
                sb.append(morse[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}

