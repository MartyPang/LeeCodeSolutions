/*
 * @lc app=leetcode id=559 lang=java
 *
 * [559] Maximum Depth of N-ary Tree
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        int max = 0;
        for(Node child : root.children) {
            int depth = maxDepth(child);
            max = Math.max(max, depth);
        }
        return max+1;
    }
}

