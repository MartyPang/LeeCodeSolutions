/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i + 2 < nums.length; ++i) {
            int j = i+1, k = nums.length-1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                minDiff = Math.abs(sum-target) < Math.abs(minDiff) ? sum-target : minDiff;
                if(sum == target) {
                    break;
                } else if (sum < target) {
                    j++;
                } else {
                    --k;
                }
            }
        }
        return minDiff+target;
    }
}

