/*
 * @lc app=leetcode id=896 lang=java
 *
 * [896] Monotonic Array
 */
class Solution {
    public boolean isMonotonic(int[] A) {
        if(A.length <= 2) return true;
        int i = 0;
        while(i < A.length-1 && A[i] == A[i+1]) ++i;
        if(i == A.length - 1) return true;
        boolean flag = A[i+1] > A[i];
        for(i = i+2; i < A.length; ++i) {
            if(flag && A[i] < A[i-1]) return false;
            if(!flag && A[i] > A[i-1]) return false;
        }
        return true;
    }
}

