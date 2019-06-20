import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
/*
 * @lc app=leetcode id=914 lang=java
 *
 * [914] X of a Kind in a Deck of Cards
 */
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length < 2) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int d : deck) map.put(d, map.getOrDefault(d, 0)+1);
        List<Integer> list = new ArrayList<>(map.values());
        int m = list.get(0);
        for(int i = 1; i < list.size(); ++i) {
            m = gcd(m, list.get(i));
            if(m < 2) return false;
        }
        return true;
    }

    private int gcd(int m, int n) {
        // if(m < n) {
        //     m ^= n;
        //     n ^= m;
        //     m ^= n;
        // }
        if(n == 0) return m;
        else return gcd(n, m%n);
    }
}

