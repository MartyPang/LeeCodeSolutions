/*
 * @lc app=leetcode id=606 lang=java
 *
 * [606] Construct String from Binary Tree
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
    public String tree2str(TreeNode t) {
        return helper(t);
    }

    private String helper(TreeNode node) {
        if(node == null) return "";
        if(node.left == null && node.right == null) return node.val + "";
        if(node.left == null && node.right != null) return node.val + "(" + helper(node.left) + ")" + "(" + helper(node.right) + ")";
        if(node.left != null && node.right == null) return node.val + "(" + helper(node.left) + ")";
        return node.val + "(" + helper(node.left) + ")" + "(" + helper(node.right) +")";
    }
}

