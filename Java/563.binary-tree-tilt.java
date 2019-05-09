import java.util.Stack;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;


/*
 * @lc app=leetcode id=563 lang=java
 *
 * [563] Binary Tree Tilt
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
    int tilt = 0;
    public int findTilt(TreeNode root) {
        helper(root);
        return tilt;
    }

    private int helper(TreeNode root) {
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);

        tilt += Math.abs(left - right);
        return left + right + root.val;
    }
}

