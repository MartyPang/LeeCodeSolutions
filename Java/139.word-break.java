import java.util.List;

/*
 * @lc app=leetcode id=139 lang=java
 *
 * [139] Word Break
 */
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s == null || s.length() == 0 || wordDict.size() == 0) return false;
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i = 1; i <= s.length(); ++i) {
            for(int j = i-1; j >= 0; --j) {
                if(dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}

