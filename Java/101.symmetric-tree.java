import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
 *
 * https://leetcode.com/problems/symmetric-tree/description/
 *
 * algorithms
 * Easy (42.72%)
 * Total Accepted:    364.1K
 * Total Submissions: 851.1K
 * Testcase Example:  '[1,2,2,3,4,4,3]'
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric
 * around its center).
 * 
 * 
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * 
 * ⁠   1
 * ⁠  / \
 * ⁠ 2   2 
 * ⁠/ \ / \
 * 3  4 4  3
 * 
 * 
 * 
 * But the following [1,2,2,null,3,null,3]  is not:
 * 
 * ⁠   1
 * ⁠  / \
 * ⁠ 2   2
 * ⁠  \   \
 * ⁠  3    3
 * 
 * 
 * 
 * 
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
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
     * Recursive
     */
    // public boolean isSymmetric(TreeNode root) {
    //     if(root == null) return true;
    //     return isLeftRightSymmetric(root.left, root.right);
    // }

    // public boolean isLeftRightSymmetric(TreeNode left, TreeNode right) {
    //     if(left == null && right == null) return true;
    //     if((left == null || right == null) || (left.val != right.val)) return false;

    //     return isLeftRightSymmetric(left.left, right.right) && isLeftRightSymmetric(left.right, right.left);
    // }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.addFirst(root.left);
        linkedList.addLast(root.right);
        while (!linkedList.isEmpty()) {
            TreeNode lNode = linkedList.removeFirst();
            TreeNode rNode = linkedList.removeLast();
            if (lNode == null && rNode == null) {
                continue;
            }
            if (lNode == null || rNode == null) {
                return false;
            }
            linkedList.addFirst(lNode.right);
            linkedList.addFirst(lNode.left);
            linkedList.addLast(rNode.left);
            linkedList.addLast(rNode.right);

            if (lNode.val != rNode.val) {
                return false;
            }
        }
        return true;
    }
}

