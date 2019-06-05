import java.util.Map;
import java.util.HashMap;
/*
 * @lc app=leetcode id=748 lang=java
 *
 * [748] Shortest Completing Word
 */
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        licensePlate = licensePlate.toLowerCase();
        int minLen = 30;
        int minIndex = -1;
        for(int i = 0; i < words.length; ++i) {
            String word = words[i];
            map.clear();
            for(char c : word.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            boolean valid = true;
            for(char s : licensePlate.toCharArray()) {
                if(s >= 'a' && s <= 'z') {
                    if(map.getOrDefault(s, 0) == 0) {
                        valid = false;
                        break;
                    }
                    map.put(s, map.get(s) - 1);
                }
            }
            if(valid) {
                if(minLen > word.length()) {
                    minLen = word.length();
                    minIndex = i;
                }

            }
        }
        return words[minIndex];
    }
}

