import java.util.LinkedList;

/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 *
 * https://leetcode.com/problems/pascals-triangle-ii/description/
 *
 * algorithms
 * Easy (42.09%)
 * Total Accepted:    190.3K
 * Total Submissions: 448.2K
 * Testcase Example:  '3'
 *
 * Given a non-negative index k where k ≤ 33, return the k^th index row of the
 * Pascal's triangle.
 * 
 * Note that the row index starts from 0.
 * 
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it.
 * 
 * Example:
 * 
 * 
 * Input: 3
 * Output: [1,3,3,1]
 * 
 * 
 * Follow up:
 * 
 * Could you optimize your algorithm to use only O(k) extra space?
 * 
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        LinkedList<Integer> result = new LinkedList<>();
        for(int i = 0; i <= rowIndex; ++i) {
            result.addFirst(1);
            for(int j = 1; j < i; ++j) {
                result.set(j, result.get(j)+result.get(j+1));
            }
        }
        return result;
        // List<Integer> result = new ArrayList<>();
        // for(int i = 0; i <= rowIndex; ++i) {
        //     result.add(0, 1);
        //     for(int j = 1; j < i; ++j) {
        //         result.set(j, result.get(j)+result.get(j+1));
        //     }
        // }
        // return result;
    }
}

