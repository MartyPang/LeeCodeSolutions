import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=884 lang=java
 *
 * [884] Uncommon Words from Two Sentences
 */
class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        String[] worda = A.split(" ");
        String[] wordb = B.split(" ");
        int count = worda.length + wordb.length;
        for(String word : worda) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        for(String word : wordb) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        List<String> res = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) res.add(entry.getKey());
        }
        return res.toArray(new String[res.size()]);
    }
}

