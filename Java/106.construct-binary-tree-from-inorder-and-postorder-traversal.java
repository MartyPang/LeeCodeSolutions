/*
 * @lc app=leetcode id=106 lang=java
 *
 * [106] Construct Binary Tree from Inorder and Postorder Traversal
 *
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
 *
 * algorithms
 * Medium (37.97%)
 * Total Accepted:    143.7K
 * Total Submissions: 375.7K
 * Testcase Example:  '[9,3,15,20,7]\n[9,15,7,20,3]'
 *
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * 
 * For example, given
 * 
 * 
 * inorder = [9,3,15,20,7]
 * postorder = [9,15,7,20,3]
 * 
 * Return the following binary tree:
 * 
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length == 0 || inorder.length == 0) return null;
        return constructNode(postorder, postorder.length-1, inorder, 0, inorder.length-1);
    }

    public TreeNode constructNode(int[] postorder, int postid, int[] inorder, int inleft, int inright) {
        if(postid < 0 || inleft > inright) return null;

        TreeNode node = new TreeNode(postorder[postid]);
        int rootindex = 0;
        for(; rootindex <= inright; ++rootindex) {
            if(inorder[rootindex] == postorder[postid]) break;
        }
        node.left = constructNode(postorder, postid-(inright-rootindex)-1, inorder, inleft, rootindex-1);
        node.right = constructNode(postorder, postid-1, inorder, rootindex+1, inright);
        return node;
    }
}

