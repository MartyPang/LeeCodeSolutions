import java.util.Arrays;

/*
 * @lc app=leetcode id=532 lang=java
 *
 * [532] K-diff Pairs in an Array
 */
class Solution {
    public int findPairs(int[] nums, int k) {
        int cnt = 0;
        Arrays.sort(nums);
        for(int i = 0, j = 0; i < nums.length; ++i) {
            for(j = Math.max(j, i+1); j < nums.length && nums[j] - nums[i] < k; ++j) ;
            if(j < nums.length && nums[j] - nums[i] == k) ++cnt;
            while(i < nums.length - 1 && nums[i+1] == nums[i]) ++i;
        }
        return cnt;
    }
}

