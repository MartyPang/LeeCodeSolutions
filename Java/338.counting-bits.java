/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */
class Solution {
    // public int[] countBits(int num) {
    //     int[] res = new int[num+1];
    //     for(int i = 0; i <= num; ++i) {
    //         res[i] = numberOfOnes(i);
    //     }
    //     return res;
    // }

    // private int numberOfOnes(int n) {
    //     int cnt = 0;
    //     while(n != 0) {
    //         ++cnt;
    //         n = ((n-1)&n);
    //     }
    //     return cnt;
    // }
    public int[] countBits(int num) {
        if(num == 0) return new int[]{0};
        if(num == 1) return new int[]{0,1};
        int[] res = new int[num+1];
        res[0] = 0;
        res[1] = 1;
        int pow = 1;
        for(int i = 2; i <= num; ++i) {
            if((i&(i-1)) == 0) {
                pow*=2;
                res[i] = 1;
            } else {
                res[i] = res[i-pow] + 1;
            }
        }
        return res;
    }
}

