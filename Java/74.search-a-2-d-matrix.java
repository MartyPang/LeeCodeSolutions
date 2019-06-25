/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int t_row = 0;
        while(t_row < matrix.length) {
            if(target <= matrix[t_row][matrix[0].length-1]) break;
            ++t_row;
        }
        if(t_row == matrix.length) return false;
        if(target == matrix[t_row][matrix[0].length-1]) return true;
        int left = 0, right = matrix[0].length - 1;
        int mid;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(matrix[t_row][mid] == target) return true;
            else if(matrix[t_row][mid] < target) left = mid+1;
            else right = mid -1;
        }
        return false;
    }
}

