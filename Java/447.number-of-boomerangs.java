import java.util.Map;

/*
 * @lc app=leetcode id=447 lang=java
 *
 * [447] Number of Boomerangs
 *
 * https://leetcode.com/problems/number-of-boomerangs/description/
 *
 * algorithms
 * Easy (49.67%)
 * Total Accepted:    53.1K
 * Total Submissions: 106.9K
 * Testcase Example:  '[[0,0],[1,0],[2,0]]'
 *
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is
 * a tuple of points (i, j, k) such that the distance between i and j equals
 * the distance between i and k (the order of the tuple matters).
 * 
 * Find the number of boomerangs. You may assume that n will be at most 500 and
 * coordinates of points are all in the range [-10000, 10000] (inclusive).
 * 
 * Example:
 * 
 * 
 * Input:
 * [[0,0],[1,0],[2,0]]
 * 
 * Output:
 * 2
 * 
 * Explanation:
 * The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 * 
 * 
 * 
 * 
 */
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int num = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] i : points) {
            for(int[] j : points) {
                if(i == j) continue;
                int distance = (i[0]-j[0])*(i[0]-j[0])+(i[1]-j[1])*(i[1]-j[1]);
                int prev = map.getOrDefault(distance, 0);
                num += 2*prev;
                map.put(distance, prev+1);
            }
            map.clear();
        }
        return num;
    }
}

