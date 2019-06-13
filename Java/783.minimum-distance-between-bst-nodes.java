/*
 * @lc app=leetcode id=783 lang=java
 *
 * [783] Minimum Distance Between BST Nodes
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
    int mindiff = Integer.MAX_VALUE;
    Integer prev = null;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return mindiff;
    }

    void inorder(TreeNode node) {
        if(node == null) return;
        inorder(node.left);
        if(prev != null) {
            mindiff = Math.min(mindiff, node.val - prev);
        }
        prev = node.val;
        inorder(node.right);
    }
}

