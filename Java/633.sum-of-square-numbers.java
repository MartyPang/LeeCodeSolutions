/*
 * @lc app=leetcode id=633 lang=java
 *
 * [633] Sum of Square Numbers
 */
class Solution {
    public boolean judgeSquareSum(int c) {
        for(int i = 2; i * i <= c; ++i) {
            int cnt = 0;
            if(c % i == 0) {
                while(c % i == 0) {
                    ++cnt;
                    c /= i;
                }
                if(i % 4 == 3 && cnt % 2 != 0) return false;
            }
        }
        return c % 4 != 3;
    }
}

