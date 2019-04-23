/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 *
 * https://leetcode.com/problems/guess-number-higher-or-lower/description/
 *
 * algorithms
 * Easy (38.73%)
 * Total Accepted:    103.7K
 * Total Submissions: 264.9K
 * Testcase Example:  '10\n6'
 *
 * We are playing the Guess Game. The game is as follows:
 * 
 * I pick a number from 1 to n. You have to guess which number I picked.
 * 
 * Every time you guess wrong, I'll tell you whether the number is higher or
 * lower.
 * 
 * You call a pre-defined API guess(int num) which returns 3 possible results
 * (-1, 1, or 0):
 * 
 * 
 * -1 : My number is lower
 * ⁠1 : My number is higher
 * ⁠0 : Congrats! You got it!
 * 
 * 
 * Example :
 * 
 * 
 * 
 * Input: n = 10, pick = 6
 * Output: 6
 * 
 * 
 * 
 */
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(guess(mid) == -1) right = mid - 1;
            else if(guess(mid) == 1) left = mid + 1;
            else return mid;
        }
        return 0;
    }
}

