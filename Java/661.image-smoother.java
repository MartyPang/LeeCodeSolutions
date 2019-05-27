/*
 * @lc app=leetcode id=661 lang=java
 *
 * [661] Image Smoother
 */
class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] res = new int[M.length][M[0].length];
        int cnt;
        int sum;
        for(int i = 0; i < M.length; ++i) {
            for(int j = 0; j < M[0].length; ++j) {
                cnt = 1;
                sum = M[i][j];
                if(j - 1 >= 0) {
                    sum += M[i][j-1];
                    ++cnt;
                }
                if(j + 1 <= M[0].length-1) {
                    sum += M[i][j+1];
                    ++cnt;
                }
                if(i - 1 >= 0) {
                    sum += M[i-1][j];
                    ++cnt;
                }
                if(i + 1 <= M.length-1) {
                    sum += M[i+1][j];
                    ++cnt;
                }
                if(j - 1 >= 0 && i - 1 >= 0) {
                    sum += M[i-1][j-1];
                    ++cnt;
                }
                if(j - 1 >= 0 && i + 1 <= M.length-1) {
                    sum += M[i+1][j-1];
                    ++cnt;
                }
                if(j + 1 <= M[0].length-1 && i-1 >= 0) {
                    sum += M[i-1][j+1];
                    ++cnt;
                }
                if(j+1<=M[0].length-1 && i+1 <= M.length-1) {
                    sum +=M[i+1][j+1];
                    ++cnt;
                }
                res[i][j] = sum/cnt;
            }
        }
        return res;
    }
}

