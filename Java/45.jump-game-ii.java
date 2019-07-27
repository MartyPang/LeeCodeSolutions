/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */
class Solution {
    // public int jump(int[] nums) {
    //     int pos = nums.length - 1;
    //     int moves = 0;
    //     while(pos != 0) {
    //         for(int i = 0; i < pos; ++i) {
    //             if(i+nums[i] >= pos) {
    //                 pos = i;
    //                 ++moves;
    //             }
    //         }
    //     }
    //     return moves;
    // }
    public int jump(int[] nums) {
        if(null == nums || nums.length <= 1) return 0;
        int curMax = 0, i = 0, furthest = 0, level = 0;
        while(i <= curMax) {
            furthest = curMax;
            for(; i <= curMax; ++i) {
                furthest = Math.max(furthest, i + nums[i]);
                if(furthest >= nums.length - 1) return level + 1;
            }
            curMax = furthest;
            ++level;
        }
        return level;
    }
}

