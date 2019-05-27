import java.util.Queue;
import java.util.LinkedList;
/*
 * @lc app=leetcode id=671 lang=java
 *
 * [671] Second Minimum Node In a Binary Tree
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
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return -1;
        int min1 = root.val;
        Integer min2 = null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; ++i) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
                if((min2 == null || node.val < min2) && node.val != min1) min2 = node.val;
            }
        }
        return min2 == null ? -1 : min2.intValue();
    }
}

