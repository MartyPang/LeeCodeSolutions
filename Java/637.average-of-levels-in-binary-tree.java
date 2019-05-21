import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
 * @lc app=leetcode id=637 lang=java
 *
 * [637] Average of Levels in Binary Tree
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            double sum = 0.0;
            int size = queue.size();
            for(int i = 0; i < size; ++i) {
                TreeNode n = queue.poll();
                if(n.left != null) queue.add(n.left);
                if(n.right != null) queue.add(n.right);
                sum += n.val;
            }
            res.add(sum/size);
        }
        return res;
    }
}

