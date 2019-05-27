/*
 * @lc app=leetcode id=653 lang=java
 *
 * [653] Two Sum IV - Input is a BST
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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> order = new ArrayList<>();
        inorder(root, order);
        int left = 0, right = order.size()-1;
        while(left < right) {
            if(order.get(left) + order.get(right) > k) {
                --right;
            } else if(order.get(left) + order.get(right) < k) {
                ++left;
            } else {
                return true;
            }
        }
        return false;
    }

    private void inorder(TreeNode root, List<Integer> order) {
        if(root == null) return;
        inorder(root.left, order);
        order.add(root.val);
        inorder(root.right, order);
    }
}

