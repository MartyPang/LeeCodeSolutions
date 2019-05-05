/*
 * @lc app=leetcode id=507 lang=java
 *
 * [507] Perfect Number
 */
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 0) return false;
        if(num == 1) return false;
        int sum = 0;
        for(int i = 1; i <= num/2; ++i) {
            if(num % i == 0) sum += i;
        }
        return sum == num;
    }
}

