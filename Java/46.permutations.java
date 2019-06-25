import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> curList, int[] nums) {
        if(curList.size() == nums.length) {
            res.add(new ArrayList<>(curList));
        }
        else {
            for(int i = 0; i < nums.length; ++i) {
                if(curList.contains(nums[i])) continue;
                curList.add(nums[i]);
                backtrack(res, curList, nums);
                curList.remove(curList.size() - 1);
            }
        }
    }
}

