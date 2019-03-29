import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 *
 * https://leetcode.com/problems/majority-element/description/
 *
 * algorithms
 * Easy (51.53%)
 * Total Accepted:    358.8K
 * Total Submissions: 692.3K
 * Testcase Example:  '[3,2,3]'
 *
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * Example 1:
 * 
 * 
 * Input: [3,2,3]
 * Output: 3
 * 
 * Example 2:
 * 
 * 
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 * 
 * 
 */
class Solution {
    // public int majorityElement(int[] nums) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     // int majority = Integer.MIN_VALUE;
    //     // int result = 0;
    //     int i = 0;
    //     for(; i < nums.length; ++i) {
    //         if(map.containsKey(nums[i])) {
    //             map.put(nums[i], map.get(nums[i])+1);
    //         }
    //         else {
    //             map.put(nums[i], 1);
    //         }
    //         if(map.get(nums[i]) > nums.length/2) break;
    //     }
    //     return nums[i];
    // }

    /**
     * Sorting
     */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

