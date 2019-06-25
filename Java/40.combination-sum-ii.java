/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(res, new ArrayList<>(), target, candidates, 0);
        return res; 
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> curList, int remain, int[] nums, int start) {
        if(remain < 0) return;
        if(remain == 0) res.add(new ArrayList<>(curList));
        else {
            for(int i = start; i < nums.length; ++i) {
                //avoid duplicate
                if(i > start && nums[i] == nums[i-1]) continue;
                curList.add(nums[i]);
                //use i+1 for next start pos
                //for not allowing multiple uses
                backtrack(res, curList, remain-nums[i], nums, i+1);
                curList.remove(curList.size()-1);
            }
        }
    }
}

