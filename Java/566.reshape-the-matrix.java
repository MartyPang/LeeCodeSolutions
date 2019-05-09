/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length * nums[0].length != r * c) return nums;
        int[][] res = new int[r][c];
        int row = 0, column = 0;
        for(int i = 0; i < r; ++i) {
            for(int j = 0; j < c; ++j) {
                res[i][j] = nums[row][column++];
                if(column == nums[0].length) {
                    ++row;
                    column = 0;
                }
            }
        }
        return res;
    }
}

