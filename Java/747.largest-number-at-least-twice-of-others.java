import java.util.Map;
import java.util.HashMap;
/*
 * @lc app=leetcode id=747 lang=java
 *
 * [747] Largest Number At Least Twice of Others
 */
class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1) return 0;
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for(int i = 0; i < nums.length; ++i) {
            map.putIfAbsent(nums[i], i);
        }
        Arrays.sort(nums);
        if(nums[nums.length - 1] >= 2 * nums[nums.length - 2]) return map.get(nums[nums.length - 1]);
        else return -1;
    }
}

