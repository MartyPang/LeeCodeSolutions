import java.util.Arrays;

/*
 * @lc app=leetcode id=354 lang=java
 *
 * [354] Russian Doll Envelopes
 */
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if(envelopes == null || envelopes.length == 0 || envelopes[0].length == 0) return 0;
        Arrays.sort(envelopes, new Comparator<int[]>(){
            @Override
            public int compare(int[] doll1, int[] doll2) {
                return doll1[0] == doll2[0] ? doll2[1] - doll1[1] : doll1[0] - doll2[0];
            }
        });
        int[] dp = new int[envelopes.length];
        int maxLen = 1;
        int res = 0;
        for(int i = 0; i < envelopes.length; ++i){
            maxLen = 1;
            for(int j = 0; j < i; ++j) {
                if(envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) {
                    maxLen = Math.max(maxLen, dp[j]+1);
                }
            }
            dp[i] = maxLen;
            res = Math.max(res, maxLen);
        }
        return res;
    }
}

