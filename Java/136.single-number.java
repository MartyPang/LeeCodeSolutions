import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 *
 * https://leetcode.com/problems/single-number/description/
 *
 * algorithms
 * Easy (59.04%)
 * Total Accepted:    430.8K
 * Total Submissions: 726.3K
 * Testcase Example:  '[2,2,1]'
 *
 * Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 * 
 * Note:
 * 
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 * 
 * Example 1:
 * 
 * 
 * Input: [2,2,1]
 * Output: 1
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [4,1,2,1,2]
 * Output: 4
 * 
 * 
 */
class Solution {
    // public int singleNumber(int[] nums) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for(int i = 0; i < nums.length; ++i) {
    //         if(map.containsKey(nums[i])) map.remove(nums[i]);
    //         else map.put(nums[i], 1);
    //     }
    //     return Integer.parseInt(map.keySet().toArray()[0].toString());
    // }

    /**
     * XOR
     */
    public int singleNumber(int[] nums) {
        //int xor = 0;
        for(int i = 1; i < nums.length; ++i) {
            nums[0] = nums[0] ^ nums[i];
        }
        return nums[0];
    }
}

