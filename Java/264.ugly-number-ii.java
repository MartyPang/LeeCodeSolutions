/*
 * @lc app=leetcode id=264 lang=java
 *
 * [264] Ugly Number II
 */
class Solution {
    public int nthUglyNumber(int n) {
        if(n <= 1) return n;
        int[] k = new int[n];
        k[0] = 1;
        int t2 = 0, t3 = 0, t5 = 0;
        for(int i = 1; i < n; ++i) {
            k[i] = Math.min(Math.min(k[t2]*2, k[t3]*3), k[t5]*5);
            if(k[i] == k[t2]*2) ++t2;
            if(k[i] == k[t3]*3) ++t3; //for special case like 3*2 == 2*3
            if(k[i] == k[t5]*5) ++t5;
        }
        return k[n-1];
    }
}

