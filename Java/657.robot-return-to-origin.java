/*
 * @lc app=leetcode id=657 lang=java
 *
 * [657] Robot Return to Origin
 */
class Solution {
    public boolean judgeCircle(String moves) {
        int[] cnt = new int[4];
        for(char c : moves.toCharArray()) {
            if(c == 'U') cnt[0]++;
            else if(c == 'D') cnt[1]++;
            else if(c == 'L') cnt[2]++;
            else cnt[3]++;
        }
        return cnt[0] == cnt[1] && cnt[2] == cnt[3];
    }
}

