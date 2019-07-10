/*
 * @lc app=leetcode id=304 lang=java
 *
 * [304] Range Sum Query 2D - Immutable
 */
class NumMatrix {
    int[][] sums;
    public NumMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        sums = new int[matrix.length][matrix[0].length+1];
        for(int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j <matrix[0].length; ++j) {
                sums[i][j+1] = sums[i][j] + matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;
        for(int i = row1; i <= row2; ++i) {
            ans += sums[i][col2+1] - sums[i][col1];
        }
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */

