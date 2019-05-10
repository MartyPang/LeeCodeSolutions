/*
 * @lc app=leetcode id=572 lang=java
 *
 * [572] Subtree of Another Tree
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
    // public boolean isSubtree(TreeNode s, TreeNode t) {
    //     if(s == null) return false;
    //     return isEqual(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    // }

    // private boolean isEqual(TreeNode s, TreeNode t) {
    //     if(s == null && t == null) return true;
    //     if(s != null && t == null || s== null && t != null) return false; 
    //     if(s.val == t.val) return isEqual(s.left, t.left) && isEqual(s.right, t.right);
    //     return false;
    // }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        String pres = preorder(s, true);
        String pret = preorder(t, true);

        return pres.indexOf(pret) >= 0;
    }

    private String preorder(TreeNode n, boolean isLeft) {
        if(n == null) {
            if(isLeft) return "lnull";
            else return "rnull";
        }
        return "#" + n.val + preorder(n.left, true) + preorder(n.right, false);
    }
}

