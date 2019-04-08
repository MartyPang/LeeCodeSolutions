/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 *
 * https://leetcode.com/problems/count-primes/description/
 *
 * algorithms
 * Easy (28.26%)
 * Total Accepted:    223.9K
 * Total Submissions: 783.2K
 * Testcase Example:  '10'
 *
 * Count the number of prime numbers less than a non-negative number, n.
 * 
 * Example:
 * 
 * 
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * 
 * 
 */
class Solution {
    /**
     * 普通筛选 O(n*sqrt(n))
     * @param n
     * @return
     */
    // public int countPrimes(int n) {
    //     int cnt = 0;
    //     for(int i = 2; i < n; ++i) {
    //         if(isPrime(i)) ++cnt;
    //     }
    //     return cnt;
    // }

    // public boolean isPrime(int n) {
    //     if(n == 2) return true;
    //     if(n < 2 || x % 2 == 0) return false;
    //     for(int i = 3; i <= Math.sqrt(n); i+=2) {
    //         if(n % i == 0) return false;
    //     }
    //     return true;
    // }

    /**
     * 埃拉托斯特尼筛法 O(n*ln(lnn))
     */
    // public int countPrimes(int n) {
    //     boolean[] notPrime = new boolean[n+1];
    //     int cnt = 0;
    //     for(int i = 2; i < n; ++i) {
    //         if(!notPrime[i]) {
    //             ++cnt;
    //             for(long j = (long)i*i; j < n; j+=i) {
    //                 notPrime[(int)j] = true;
    //             }
    //         }
    //     }
    //     return cnt;
    // }

    /**
     * 欧拉筛法 O(n)
     */
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n+1];
        int[] primes = new int[n+1];
        int cnt = 0;
        for(int i = 2; i < n; ++i) {
            if(!notPrime[i]) {
                primes[cnt++] = i;
            }
            for(int j = 0; j < cnt && primes[j]*i < n; ++j) {
                notPrime[primes[j]*i] = true;
                if(i % primes[j] == 0) break;
            }
        }
        return cnt;
    }
}

