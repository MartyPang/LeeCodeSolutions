/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */
class Solution {
    public boolean canJump(int[] nums) {
        int dis = 0;
        for(int i =0; i <= dis; ++i) {
            dis = Math.max(dis, nums[i]+i);
            if(dis >= nums.length - 1) return true;
        }
        return false;
    }
}

