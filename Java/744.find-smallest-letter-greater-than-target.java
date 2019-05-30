/*
 * @lc app=leetcode id=744 lang=java
 *
 * [744] Find Smallest Letter Greater Than Target
 */
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length;

        while(left < right) {
            int mid = left + (right - left) /  2;
            if(letters[mid] > target) right = mid;
            else left = mid + 1;
        }

        return letters[left % letters.length];
    }
}

