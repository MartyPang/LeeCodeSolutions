/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */
class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(x == 1) return 1;
        if(x == -1) return (n&1) == 0 ? 1 : -1;
        if(n == Integer.MIN_VALUE) return 0;
        if(n < 0) {
            n = -n;
            x = 1/x;
        }
        double ans = 1.0;
        while(n != 0) {
            if((n&1) == 1) {
                ans *= x;
            }
            x *= x;
            n >>= 1;
        }
        return ans;
    }
}

