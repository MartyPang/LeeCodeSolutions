import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */
class Solution {
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        used = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res, new ArrayList<>(), nums);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> curList, int[] nums) {
        if(curList.size() == nums.length) {
            res.add(new ArrayList<>(curList));
        } else {
            for(int i = 0; i < nums.length; ++i) {
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
                curList.add(nums[i]);
                used[i] = true;
                backtrack(res, curList, nums);
                used[i] = false;
                curList.remove(curList.size()-1);
            }
        }
    }
}

