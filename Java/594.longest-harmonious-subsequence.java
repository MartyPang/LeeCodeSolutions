/*
 * @lc app=leetcode id=594 lang=java
 *
 * [594] Longest Harmonious Subsequence
 */
class Solution {
    // public int findLHS(int[] nums) {
    //     Arrays.sort(nums);
    //     int len = 0;
    //     boolean isLHS;
    //     int tmp = 0;
    //     for(int i = 0; i < nums.length; ++i) {
    //         isLHS = false;
    //         tmp = 0;
    //         int j = i + 1;
    //         for(; j < nums.length; ++j) {
    //             if(nums[j] - nums[i] == 0) ++tmp;
    //             else if(nums[j] - nums[i] == 1) {
    //                 ++tmp;
    //                 isLHS = true;
    //             }
    //             else break;
    //         }
    //         if(isLHS) len = Math.max(len, tmp);
    //     }
    //     return len == 0 ? len : len + 1;
    // }

    // public int findLHS(int[] nums) {
    //     Arrays.sort(nums);
    //     int len = 0;
    //     int left = 0, right = 1;
    //     while(right < nums.length) {
    //         while(left < nums.length && nums[right] - nums[left] > 1) ++left;
    //         if(nums[right] - nums[left] == 1) len = Math.max(right-left+1, len);
    //         ++right;
    //     }
    //     return len;
    // }

    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int res = 0;
        for(int n : nums) {
            if(map.containsKey(n+1)) {
                res = Math.max(res, map.get(n)+map.get(n+1));
            }
        }
        return res;
    }
}

