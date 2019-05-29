/*
 * @lc app=leetcode id=693 lang=java
 *
 * [693] Binary Number with Alternating Bits
 */
class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n == 0) return false;
        int last = n & 1;
        n >>= 1;
        while(n != 0) {
            int adj = n & 1;
            if(last == adj) return false;
            last = adj;
            n >>= 1; 
        }
        return true;
    }
}

