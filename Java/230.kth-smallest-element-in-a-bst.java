import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
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
    List<Integer> l = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return l.get(k-1);
    }

    private void inorder(TreeNode root, int k) {
        if(root  == null) return;
        if(l.size() >= k) return;
        inorder(root.left, k);
        l.add(root.val);
        inorder(root.right, k);
    }
}

