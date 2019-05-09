import java.util.Arrays;

/*
 * @lc app=leetcode id=561 lang=java
 *
 * [561] Array Partition I
 */
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i += 2) {
            if(i == 0) {
                nums[0] = Math.min(nums[i], nums[i+1]);
            } else {
                nums[0] += Math.min(nums[i], nums[i+1]);
            }
        }
        return nums[0];
    }
}

