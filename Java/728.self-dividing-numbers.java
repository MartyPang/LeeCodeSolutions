import java.util.*;
/*
 * @lc app=leetcode id=728 lang=java
 *
 * [728] Self Dividing Numbers
 */
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(; left <= right; ++left) {
            int tmp = left;
            while(tmp != 0) {
                int digit = tmp % 10;
                if(digit == 0 || left % digit != 0) break;
                tmp /= 10;
            }
            if(tmp == 0) res.add(left);
        }
        return res;
    }
}

