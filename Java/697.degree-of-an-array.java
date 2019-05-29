import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
/*
 * @lc app=leetcode id=697 lang=java
 *
 * [697] Degree of an Array
 */
class Solution {
    public int findShortestSubArray(int[] nums) {
        /**
         * 0 - count
         * 1 - left
         * 2 - right
         */
        Map<Integer, List<Integer>> map = new HashMap<>();

        int max_degree = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; ++i) {
            int x = nums[i];
            List<Integer> tmp = map.get(x);
            if(tmp == null) {
                tmp = new ArrayList<>();
                tmp.add(1); //cnt
                tmp.add(i); //left
                tmp.add(i); //right
                map.put(x, tmp);
            }
            else {
                tmp.set(0, tmp.get(0)+1);
                tmp.set(2, i);
            }
            if(tmp.get(0) > max_degree) max_degree = tmp.get(0);
        }

        int res = nums.length;
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if(entry.getValue().get(0) == max_degree) {
                res = Math.min(res, entry.getValue().get(2) - entry.getValue().get(1)+1);
            }
        }
        return res;
    }
}

