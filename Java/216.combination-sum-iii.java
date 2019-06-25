import java.util.List;

/*
 * @lc app=leetcode id=216 lang=java
 *
 * [216] Combination Sum III
 */
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<Integer>(), k, n, 1);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> cur, int k, int remain, int start) {
        if(remain < 0) return;
        if(cur.size() == k && remain == 0) {
            res.add(new ArrayList<>(cur));
        } else {
            for(int i = start; i <= 9 && cur.size() <= k; ++i) {
                cur.add(i);
                helper(res, cur, k, remain - i, i+1);
                cur.remove(cur.size() - 1);
            }
        }
    }
}

