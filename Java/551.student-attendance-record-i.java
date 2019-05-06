/*
 * @lc app=leetcode id=551 lang=java
 *
 * [551] Student Attendance Record I
 */
class Solution {
    public boolean checkRecord(String s) {
        return !s.contains("LLL") && (s.indexOf("A") == s.lastIndexOf("A"));
    }
}

