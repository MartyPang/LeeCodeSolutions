/*
 * @lc app=leetcode id=174 lang=java
 *
 * [174] Dungeon Game
 */
class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        if(dungeon == null || dungeon.length == 0 || dungeon[0].length == 0) return 0;
        for(int i = dungeon.length - 1; i >= 0; --i) {
            for(int j = dungeon[0].length - 1; j >= 0; --j) {
                if(i == dungeon.length - 1 && j == dungeon[0].length - 1) {
                    dungeon[i][j] = Math.max(1, 1 - dungeon[i][j]);
                } else if(j == dungeon[0].length-1) {
                    dungeon[i][j] = Math.max(1, dungeon[i+1][j] - dungeon[i][j]);
                } else if(i == dungeon.length-1) {
                    dungeon[i][j] = Math.max(1, dungeon[i][j+1] - dungeon[i][j]);
                } else {
                    dungeon[i][j] = Math.max(1, Math.min(dungeon[i+1][j], dungeon[i][j+1]) - dungeon[i][j]);
                }
            }
        }
        return dungeon[0][0];
    }
}

