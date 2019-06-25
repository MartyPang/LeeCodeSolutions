/*
 * @lc app=leetcode id=275 lang=java
 *
 * [275] H-Index II
 */
class Solution {
    public int hIndex(int[] citations) {
        int l = 0, r = citations.length -1, mid;
        while(l <= r) {
            mid = l + (r - l) / 2;
            if(citations[mid] == citations.length - mid) return citations[mid];
            else if(citations[mid] > citations.length - mid) r = mid-1;
            else l = mid + 1;
        }
        return citations.length - r - 1;
    }
}

