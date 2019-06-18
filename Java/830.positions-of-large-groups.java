import java.util.List;

/*
 * @lc app=leetcode id=830 lang=java
 *
 * [830] Positions of Large Groups
 */
class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        int first = 0, last = 0, cnt = 0;
        while(first < S.length()) {
            cnt = 0;
            while(last < S.length() && S.charAt(last) == S.charAt(first)) {
                ++last;
                ++cnt;
            }
            if(cnt >= 3) {
                List<Integer> large = new ArrayList<>();
                large.add(first);
                large.add(last - 1);
                res.add(large);
            }
            first = last;
        }
        return res;
    }
}

