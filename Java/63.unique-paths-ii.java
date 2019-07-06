/*
 * @lc app=leetcode id=63 lang=java
 *
 * [63] Unique Paths II
 */
class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        for(int i = 0; i < grid.length; ++i) {
            for(int j = 0; j < grid[0].length; ++j) {
                if(i == 0 && j == 0) {
                    if(grid[i][j] == 1) return 0;
                    grid[i][j] = 1;
                } else if (j == 0) {
                    grid[i][j] = grid[i][j] == 1 ? 0 : grid[i-1][j];
                } else if(i == 0) {
                    grid[i][j] = grid[i][j] == 1 ? 0 : grid[i][j-1];
                } else {
                    grid[i][j] = grid[i][j] == 1 ? 0 : grid[i-1][j] + grid[i][j-1];
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}

