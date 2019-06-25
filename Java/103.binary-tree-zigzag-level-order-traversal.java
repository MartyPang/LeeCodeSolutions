import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*
 * @lc app=leetcode id=103 lang=java
 *
 * [103] Binary Tree Zigzag Level Order Traversal
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        boolean left_right = true;
        while(!stack.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            while(!stack.isEmpty()) {
                TreeNode node = stack.pop();
                level.add(node.val);
                if(left_right) {
                    if(node.left != null) queue.offer(node.left);
                    if(node.right != null) queue.offer(node.right);
                } else {
                    if(node.right != null) queue.offer(node.right);
                    if(node.left != null) queue.offer(node.left);
                }
            }
            res.add(level);
            while(!queue.isEmpty()) {
                stack.push(queue.poll());
            }
            left_right = !left_right;
        }
        return res;
    }
}

