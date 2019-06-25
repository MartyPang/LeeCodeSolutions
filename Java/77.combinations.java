import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), n, k, 1, n-k+1);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> curList, int n, int k, int start, int end) {
        if(k == 0) {
            res.add(new ArrayList<>(curList));
        } else {
            for(int i = start; i <= end; ++i) {
                curList.add(i);
                backtrack(res, curList, n, k-1, i+1, end+1);
                curList.remove(curList.size() - 1);
            } 
        }
    }
}

