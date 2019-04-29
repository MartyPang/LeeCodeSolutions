import java.util.Arrays;

/*
 * @lc app=leetcode id=453 lang=java
 *
 * [453] Minimum Moves to Equal Array Elements
 *
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/description/
 *
 * algorithms
 * Easy (49.07%)
 * Total Accepted:    56.1K
 * Total Submissions: 114.2K
 * Testcase Example:  '[1,2,3]'
 *
 * Given a non-empty integer array of size n, find the minimum number of moves
 * required to make all array elements equal, where a move is incrementing n -
 * 1 elements by 1.
 * 
 * Example:
 * 
 * Input:
 * [1,2,3]
 * 
 * Output:
 * 3
 * 
 * Explanation:
 * Only three moves are needed (remember each move increments two elements):
 * 
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 * 
 * 
 */
class Solution {
    public int minMoves(int[] nums) {
        if(nums.length == 0) return 0;
        int moves = 0;
        int min = Integer.MAX_VALUE;
        for(int n : nums) min = n < min ? n : min;
        for(int n : nums) moves += n - min;
        return moves;
    }
}

