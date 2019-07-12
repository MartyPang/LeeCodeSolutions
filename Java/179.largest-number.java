import java.util.Arrays;

/*
 * @lc app=leetcode id=179 lang=java
 *
 * [179] Largest Number
 */
class Solution {
    public String largestNumber(int[] nums) {
        String[] snums = new String[nums.length];
        boolean isZero = true;
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] != 0) isZero = false;
            snums[i] = nums[i] + "";
        }
        if(isZero) return "0";
        Arrays.sort(snums, (a,b)->(b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for(String s :snums) {
            sb.append(s);
        }
        return sb.toString();
    }
}

