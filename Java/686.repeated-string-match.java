/*
 * @lc app=leetcode id=686 lang=java
 *
 * [686] Repeated String Match
 */
class Solution {
    public int repeatedStringMatch(String A, String B) {
        //if(A.length() >= B.length()) return A.indexOf(B, 0) == -1 ? -1 : 1;
        StringBuilder sb = new StringBuilder(A);
        int t = 1;
        while(sb.length() < B.length()) {
            sb.append(A);
            ++t;
        }
        if(sb.indexOf(B) >= 0) return t;
        if(sb.append(A).indexOf(B) >= 0) return t+1;
        return -1;
    }
}

