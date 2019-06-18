/*
 * @lc app=leetcode id=832 lang=java
 *
 * [832] Flipping an Image
 */
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i < A.length; ++i) {
            int j = 0;
            for(; j < A[i].length/2; ++j) {
                if(A[i][j] == A[i][A[i].length - 1 - j]) {
                    A[i][j] ^= 1;
                    A[i][A[i].length-1-j] ^= 1;
                }
            }
            if(A[i].length % 2 == 1) A[i][j] ^= 1;
        }
        return A;
    }
}

