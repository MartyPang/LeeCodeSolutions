/*
 * @lc app=leetcode id=669 lang=java
 *
 * [669] Trim a Binary Search Tree
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
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null) return null;
        while(root != null && (root.val < L || root.val > R)) {
            if(root.val > R) root = root.left;
            if(root.val < L) root = root.right; 
            
        }
        TreeNode tmpL = root;
        while(tmpL != null) {
            while(tmpL.left != null && tmpL.left.val < L) {
                tmpL.left = tmpL.left.right;
            }
            tmpL = tmpL.left;
        }
        TreeNode tmpR = root;
        while(tmpR != null) {
            while(tmpR.right != null && tmpR.right.val > R) {
                tmpR.right = tmpR.right.left;
            }
            tmpR = tmpR.right;
        }
        return root;
    }

    // public TreeNode trimBST(TreeNode root, int L, int R) {
    //     if(root == null) return null;
    //     if(root.val > R) return trimBST(root.left, L, R);
    //     if(root.val < L) return trimBST(root.right, L, R);

    //     root.left = trimBST(root.left, L, R);
    //     root.right = trimBST(root.right, L, R);

    //     return root;
    // }
}

