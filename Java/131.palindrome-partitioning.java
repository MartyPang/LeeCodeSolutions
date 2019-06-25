import java.util.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), s, 0);
        return res;
    }

    private void backtrack(List<List<String>> res, List<String> curList, String s, int start) {
        if(start == s.length()) {
            res.add(new ArrayList<>(curList));
        } else {
            for(int i = start; i < s.length(); ++i) {
                if(isPalindrome(s, start, i)) {
                    curList.add(s.substring(start, i+1));
                    backtrack(res, curList, s, i+1);
                    curList.remove(curList.size() - 1);
                }
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while(start < end) {
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}

