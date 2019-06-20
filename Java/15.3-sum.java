import java.util.ArrayList;
import java.util.List;
/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i+2<nums.length; ++i) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int target = -nums[i];
            int j = i + 1, k = nums.length - 1;
            while(j < k) {
                if(nums[j] + nums[k] == target) {
                    List<Integer> sol = new ArrayList<>();
                    sol.add(nums[i]);
                    sol.add(nums[j]);
                    sol.add(nums[k]);
                    res.add(sol);
                    while(j < k && nums[j] == nums[j+1]) ++j;
                    while(j < k && nums[k] == nums[k-1]) --k;
                    ++j; --k;
                } else if(nums[j] + nums[k] < target) {
                    ++j;
                } else {
                    --k;
                }
            }
        }
        return res;
    }
}

