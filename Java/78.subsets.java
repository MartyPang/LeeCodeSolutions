import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 *
 * https://leetcode.com/problems/subsets/description/
 *
 * algorithms
 * Medium (51.02%)
 * Total Accepted:    341.1K
 * Total Submissions: 661.9K
 * Testcase Example:  '[1,2,3]'
 *
 * Given a set of distinct integers, nums, return all possible subsets (the
 * power set).
 * 
 * Note: The solution set must not contain duplicate subsets.
 * 
 * Example:
 * 
 * 
 * Input: nums = [1,2,3]
 * Output:
 * [
 * ⁠ [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 * 
 */
class Solution {
    // public List<List<Integer>> subsets(int[] nums) {
    //     List<List<Integer>> result = new ArrayList<>();
    //     List<Integer> empty_set = new ArrayList<>();
    //     result.add(empty_set);
    //     for(int i = 0; i < nums.length; ++i) {
    //         int prev_size = result.size();
    //         for(int j = 0; j < prev_size; ++j) {
    //             List<Integer> subset = new ArrayList<>(result.get(j));
    //             subset.add(nums[i]);
    //             result.add(subset);
    //         }
    //     }
    //     return result;
    // }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < (1 << nums.length); ++i) {
            List<Integer> subset = new ArrayList<>();
            for(int j = 0; j < nums.length; ++j) {
                if(((i >> j) & 1) > 0) subset.add(nums[j]);
            }
            result.add(subset);
        }
        return result;
    }
}

