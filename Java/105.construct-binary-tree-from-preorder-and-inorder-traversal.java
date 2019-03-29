/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
 *
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
 *
 * algorithms
 * Medium (39.50%)
 * Total Accepted:    205.6K
 * Total Submissions: 516.4K
 * Testcase Example:  '[3,9,20,15,7]\n[9,3,15,20,7]'
 *
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * 
 * For example, given
 * 
 * 
 * preorder = [3,9,20,15,7]
 * inorder = [9,3,15,20,7]
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0) return null;
        return constructNode(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

    public TreeNode constructNode(int[] preorder, int preleft, int preright, int[] inorder, int inleft, int inright) {
        if(preleft > preright || inleft > inright) return null;
        TreeNode node = new TreeNode(preorder[preleft]);
        int rootindex = inleft;
        for(; rootindex <= inright; ++rootindex) {
            if(inorder[rootindex] == preorder[preleft]) break;
        }
        node.left = constructNode(preorder, preleft+1, preleft+(rootindex-inleft), inorder, inleft, rootindex-1);
        node.right = constructNode(preorder, preleft+(rootindex-inleft)+1, preright, inorder, rootindex+1, inright);
        return node;
    } 
}

