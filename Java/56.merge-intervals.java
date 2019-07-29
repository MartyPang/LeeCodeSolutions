import java.util.*;

/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */
class Solution {
    public int[][] merge(int[][] intervals) {
        if(null == intervals || intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a, b) -> {return a[0] < b[0] ? -1 : a[0] == b[0] ? 0 : 1;});
        ArrayList<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for(int i = 1; i < intervals.length; ++i) {
            int[] last = res.get(res.size()-1);
            if(intervals[i][0]  <= last[1]) {
                last[1] = Math.max(last[1], intervals[i][1]);
            } else {
                res.add(intervals[i]);
            }
        }
        int[][] ans = new int[res.size()][2];
        for(int i = 0; i < res.size(); ++i) {
            ans[i][0] = res.get(i)[0];
            ans[i][1] = res.get(i)[1];
        }
        return ans;
    }
}

