import java.util.Arrays;

/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -1; ++i) {
            if(nums[i] == nums[i+1]) return nums[i];
        }
        return 0;
    }
}

