import java.util.Arrays;

/*
 * @lc app=leetcode id=1024 lang=java
 *
 * [1024] Video Stitching
 */
class Solution {
    // public int videoStitching(int[][] clips, int T) {
    //     if(clips == null || clips.length == 0 || clips[0].length != 2) return -1;
    //     Arrays.sort(clips, (a,b) -> a[0] - b[0]);
    //     int[] dp = new int[T+1];
    //     Arrays.fill(dp, T+1);
    //     dp[0] = 0;
    //     for(int i = 0; i < clips.length; ++i) {
    //         for(int j = clips[i][0] + 1; j <= T && j <= clips[i][1]; ++j) {
    //             dp[j] = Math.min(dp[j], dp[clips[i][0]]+1);
    //         }
    //     }
    //     return dp[T] == T+1 ? -1 : dp[T];
    // }

    public int videoStitching(int[][] clips, int T) {
        if(clips == null || clips.length == 0 || clips[0].length != 2) return -1;
        int[] dp = new int[T+1];
        Arrays.fill(dp, T+1);
        dp[0] = 0;
        for(int i = 1; i <= T; ++i) {
            for(int[] c : clips) {
                if(i >= c[0] && i <= c[1]) {
                    dp[i] = Math.min(dp[i], dp[c[0]]+1);
                }
            }
        }
        return dp[T] == T+1 ? -1 : dp[T];
    }
}

