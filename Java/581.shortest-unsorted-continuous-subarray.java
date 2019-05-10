import java.util.Arrays;
import java.util.Stack;

/*
 * @lc app=leetcode id=581 lang=java
 *
 * [581] Shortest Unsorted Continuous Subarray
 */
class Solution {
    /**
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    // public int findUnsortedSubarray(int[] nums) {
    //     int first = nums.length, last = 0;
    //     for(int i = 0; i < nums.length-1; ++i) {
    //         for(int j = i+1; j < nums.length; ++j) {
    //             if(nums[i] > nums[j]) {
    //                 first = Math.min(first, i);
    //                 last = Math.max(last, j);
    //             }
    //         }
    //     }
    //     return last > first ? last - first + 1 : 0;
    // }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    // public int findUnsortedSubarray(int[] nums) {
    //     int first = nums.length, last = 0;
    //     Stack<Integer> stack = new Stack<>();
    //     for(int i = 0; i < nums.length; ++i) {
    //         while(!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
    //             first = Math.min(first, stack.pop());
    //         }
    //         stack.push(i);
    //     }
    //     if(stack.size() == nums.length) return 0;
    //     stack.clear();
    //     for(int j = nums.length - 1; j >= 0; --j) {
    //         while(!stack.isEmpty() && nums[stack.peek()] < nums[j]) {
    //             last = Math.max(last, stack.pop());
    //         }
    //         stack.push(j);
    //     }
    //     return last - first + 1;
    // }

    /**
     * Time Complexity: O(nlgn)
     * Space Complexity: O(1)
     */
    public int findUnsortedSubarray(int[] nums) {
        int first = 0, last = nums.length - 1;
        int[] copyNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        for(; first < nums.length; ++first) {
            if(copyNums[first] != nums[first]) break;
        }
        for(; last >=0; --last) {
            if(copyNums[last] != nums[last]) break;
        }
        return last > first ? last - first + 1 : 0;
    }
}

