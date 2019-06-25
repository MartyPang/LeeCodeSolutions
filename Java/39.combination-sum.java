import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(res, new ArrayList<Integer>(), candidates, target, 0);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> cur, int[] nums, int remain, int start) {
        if(remain < 0) return;
        if(remain == 0) {
            res.add(new ArrayList<>(cur));
        } else {
            for(int i = start; i < nums.length; ++i) {
                cur.add(nums[i]);
                helper(res, cur, nums, remain - nums[i], i);
                cur.remove(cur.size() - 1);
            }
        }
    }
}

