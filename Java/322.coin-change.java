/*
 * @lc app=leetcode id=322 lang=java
 *
 * [322] Coin Change
 */
class Solution {
    public int coinChange(int[] coins, int amount) {
        if(coins.length == 0) return -1;
        if(amount == 0) return 0;
        int[] dp = new int[amount+1];
        for(int i = 0; i < amount + 1; ++i) {
            dp[i] = amount + 1;
        }
        dp[0] = 0;
        for(int i = 1; i <= amount; ++i) {
            for(int j = 0; j < coins.length; ++j) {
                if(coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}

