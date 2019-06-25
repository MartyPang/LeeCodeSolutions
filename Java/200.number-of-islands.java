/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */
class Solution {
    public int numIslands(char[][] grid) {
        int cnt = 0;
        if(grid.length == 0 || grid[0].length == 0) return cnt;
        for(int i = 0; i < grid.length; ++i) {
            for(int j = 0; j < grid[i].length; ++j) {
                if(grid[i][j] == '1') {
                    dfsSearch(grid, i, j);
                    ++cnt;
                }
            }
        }
        return cnt;
    }

    private void dfsSearch(char[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i == grid.length || j == grid[i].length || grid[i][j] != '1') return;
        grid[i][j] = '0';
        dfsSearch(grid, i+1, j);
        dfsSearch(grid, i-1, j);
        dfsSearch(grid, i, j+1);
        dfsSearch(grid, i, j-1);
    }
}

