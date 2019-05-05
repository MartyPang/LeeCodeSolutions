import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/*
 * @lc app=leetcode id=506 lang=java
 *
 * [506] Relative Ranks
 */
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        if(nums == null) return null;
        if(nums.length == 0) return new String[0];
        String[] res = new String[nums.length];
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        int i = 0;
        for(; i < nums.length; ++i) {
            map.put(nums[i], i);
        }
        i = 1;
        for(int val : map.keySet()) {
            if(i == 1) res[map.get(val)] = "Gold Medal";
            else if(i == 2) res[map.get(val)] = "Silver Medal";
            else if(i == 3) res[map.get(val)] = "Bronze Medal";
            else res[map.get(val)] = i + "";
            ++i;
        }
        return res;
    }
}

