import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 *
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 *
 * algorithms
 * Medium (55.08%)
 * Total Accepted:    442.7K
 * Total Submissions: 789.4K
 * Testcase Example:  '[1,null,2,3]'
 *
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * 
 * Example:
 * 
 * 
 * Input: [1,null,2,3]
 * ⁠  1
 * ⁠   \
 * ⁠    2
 * ⁠   /
 * ⁠  3
 * 
 * Output: [1,3,2]
 * 
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 * 
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
    /**
     * Iterative
     * @param root
     * @return
     */
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> result = new ArrayList<>();
    //     Stack<TreeNode> stack = new Stack<>();
    //     TreeNode tmp = root;
    //     while(tmp != null || !stack.isEmpty()) {
    //         if(tmp != null) {
    //             stack.push(tmp);
    //             tmp = tmp.left;
    //         }
    //         else {
    //             TreeNode node = stack.pop();
    //             result.add(node.val);
    //             tmp = node.right;
    //         }
    //     }
    //     return result;
    // }

    /**
     * Recursive
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode node, List<Integer> res) {
        if(node == null) return;
        helper(node.left, res);
        res.add(node.val);
        helper(node.right, res);
    }
}

