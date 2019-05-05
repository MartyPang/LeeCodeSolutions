import java.util.Stack;

/*
 * @lc app=leetcode id=538 lang=java
 *
 * [538] Convert BST to Greater Tree
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
    // public TreeNode convertBST(TreeNode root) {
    //     if(root == null) return root;
    //     Stack<TreeNode> stack = new Stack<>();
    //     TreeNode node = root;
    //     int sum = 0;
    //     while(node != null || !stack.isEmpty()) {
    //         while(node != null) {
    //             stack.push(node);
    //             node = node.right;
    //         }
    //         node = stack.pop();
    //         int tmp = node.val;
    //         node.val += sum;
    //         sum += tmp;
    //         node = node.left;
    //     }
    //     return root;
    // }

    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null) return null;
        convertBST(root.right);
        int tmp = root.val;
        root.val += sum;
        sum += tmp;
        convertBST(root.left);
        return root;
    }
}

