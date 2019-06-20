import java.util.*;
/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i + 3 < nums.length; ++i) {
            for(int j = i + 1; j + 2 < nums.length; ++j) {
                int lo = j + 1, hi = nums.length - 1;
                while(lo < hi) {
                    int sum = nums[lo] + nums[hi] + nums[i] + nums[j];
                    if(sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
                        while(lo < hi && nums[lo] == nums[lo + 1]) ++lo;
                        while(lo < hi && nums[hi] == nums[hi-1]) --hi;
                        ++lo; --hi;
                    } else if (sum < target) {
                        ++lo;
                    } else {
                        --hi;
                    }
                }
                while(j < nums.length-1 && nums[j] == nums[j+1]) ++j;
            }
            while(i < nums.length-1 && nums[i] == nums[i+1]) ++i;
        }
        return res;
    }
}

