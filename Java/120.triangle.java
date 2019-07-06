import java.util.*;
/*
 * @lc app=leetcode id=120 lang=java
 *
 * [120] Triangle
 */
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = 1; i <= triangle.size(); ++i) {
            for(int j = 1; j <= i; ++j) {
                if(i == 1 && j == 1) ;
                else if(j == 1) triangle.get(i-1).set(j-1, triangle.get(i-2).get(j-1)+triangle.get(i-1).get(j-1));
                else if(i == j) triangle.get(i-1).set(j-1, triangle.get(i-2).get(j-2)+triangle.get(i-1).get(j-1));
                else triangle.get(i-1).set(j-1, Math.min(triangle.get(i-2).get(j-2), triangle.get(i-2).get(j-1))+triangle.get(i-1).get(j-1));
            }
        }
        int min = Integer.MAX_VALUE;
        for(int a : triangle.get(triangle.size()-1)) {
            min = Math.min(a, min);
        }
        return min;
    }
}

