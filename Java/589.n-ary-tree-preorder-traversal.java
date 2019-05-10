import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=589 lang=java
 *
 * [589] N-ary Tree Preorder Traversal
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
    List<Integer> res = new ArrayList<>();
    /**
     * Recursively
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        if(root == null) return res;
        res.add(root.val);
        for(Node n : root.children) {
            preorder(n);
        }
        return res;
    }

    /**
     * Iteratively
     * @param root
     * @return
     */
    // public List<Integer> preorder(Node root) {
    //     List<Integer> res = new ArrayList<>();
    //     if(root == null) return res;
    //     Stack<Node> stack = new Stack<>();
    //     stack.push(root);
    //     while(!stack.isEmpty()) {
    //         Node n = stack.pop();
    //         res.add(n.val);
    //         for(int i = n.children.size()-1; i >=0; --i) {
    //             stack.push(n.children.get(i));
    //         }
    //     }
    //     return res;
    // }
}

