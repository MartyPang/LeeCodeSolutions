import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 *
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 *
 * algorithms
 * Easy (52.97%)
 * Total Accepted:    210.8K
 * Total Submissions: 390.4K
 * Testcase Example:  '[1,2,2,1]\n[2,2]'
 *
 * Given two arrays, write a function to compute their intersection.
 * 
 * Example 1:
 * 
 * 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * 
 * 
 * Note:
 * 
 * 
 * Each element in the result must be unique.
 * The result can be in any order.
 * 
 * 
 * 
 * 
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //if(nums1.length == 0 || nums2.length == 0) return new int[0];
        Map<Integer, Integer> map  = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums1.length; ++i) {
            map.put(nums1[i], 1);
        }
        for(int i = 0; i < nums2.length; ++i) {
            if(null != map.remove(nums2[i])) {
                res.add(nums2[i]);
            }
        }
        int[] a = new int[res.size()];
        for(int i = 0; i < res.size(); ++i) {
            a[i] = res.get(i);
        }
        return a;
    }
}

