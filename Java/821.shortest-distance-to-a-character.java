import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

/*
 * @lc app=leetcode id=821 lang=java
 *
 * [821] Shortest Distance to a Character
 */
class Solution {
    /**
     * Two pointer
     */
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        int isC = -1, noC = 0;
        for(int i = 0; i < S.length(); ++i) {
            if(S.charAt(i) == C) {
                while(noC <= i) {
                    res[noC] = Math.min(res[noC], i-noC);
                    noC++;
                }
                isC = i;
            }
            else {
                res[i] = isC == -1 ? Integer.MAX_VALUE : i - isC;
            }
        }
        return res;
    }
}

