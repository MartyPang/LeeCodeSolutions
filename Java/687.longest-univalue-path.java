/*
 * @lc app=leetcode id=687 lang=java
 *
 * [687] Longest Univalue Path
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int max_len = Integer.MIN_VALUE;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
        helper(root, root.val);
        return max_len;
    }

    private int helper(TreeNode node, int prev) {
        if(node == null) return 0;
        int left =  helper(node.left, node.val);
        int right = helper(node.right, node.val);
        max_len = Math.max(max_len, left + right);
        if(prev == node.val) return Math.max(left, right) + 1;
        return 0;
    }
}

