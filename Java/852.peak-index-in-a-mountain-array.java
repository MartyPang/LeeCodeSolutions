/*
 * @lc app=leetcode id=852 lang=java
 *
 * [852] Peak Index in a Mountain Array
 */
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int maxV = Integer.MIN_VALUE;
        int maxI = -1;
        for(int i = 0; i < A.length; ++i) {
            if(A[i] > maxV) {
                maxV = A[i];
                maxI = i;
            }
        }
        return maxI;
    }
}

