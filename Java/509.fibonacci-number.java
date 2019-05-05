/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */
class Solution {
    public int fib(int N) {
        if(N <= 1) return N;
        return fib(N-1) + fib(N-2);
    }
}

