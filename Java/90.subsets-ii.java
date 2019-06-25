/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> curList, int[] nums, int start) {
        res.add(new ArrayList<>(curList));
        for(int i = start; i < nums.length; ++i) {
            if(i > start && nums[i] == nums[i-1]) continue;
            curList.add(nums[i]);
            backtrack(res, curList, nums, i + 1);
            curList.remove(curList.size()-1);
        }
    }
}

