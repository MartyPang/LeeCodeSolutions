/*
 * @lc app=leetcode id=427 lang=java
 *
 * [427] Construct Quad Tree
 *
 * https://leetcode.com/problems/construct-quad-tree/description/
 *
 * algorithms
 * Easy (54.25%)
 * Total Accepted:    9.5K
 * Total Submissions: 17K
 * Testcase Example:  '[[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,1,1,1,1],[1,1,1,1,1,1,1,1],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0]]'
 *
 * We want to use quad trees to store an N x N boolean grid. Each cell in the
 * grid can only be true or false. The root node represents the whole grid. For
 * each node, it will be subdivided into four children nodes until the values
 * in the region it represents are all the same.
 * 
 * Each node has another two boolean attributes : isLeaf and val. isLeaf is
 * true if and only if the node is a leaf node. The val attribute for a leaf
 * node contains the value of the region it represents.
 * 
 * Your task is to use a quad tree to represent a given grid. The following
 * example may help you understand the problem better:
 * 
 * Given the 8 x 8 grid below, we want to construct the corresponding quad
 * tree:
 * 
 * 
 * 
 * It can be divided according to the definition above:
 * 
 * 
 * 
 * 
 * 
 * The corresponding quad tree should be as following, where each node is
 * represented as a (isLeaf, val) pair.
 * 
 * For the non-leaf nodes, val can be arbitrary, so it is represented as *.
 * 
 * 
 * 
 * Note:
 * 
 * 
 * N is less than 1000 and guaranteened to be a power of 2.
 * If you want to know more about the quad tree, you can refer to its wiki.
 * 
 * 
 */
/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};
*/
class Solution {
    public Node construct(int[][] grid) {
        return helper(0,0,grid.length-1, grid[0].length-1, grid);
    }

    private Node helper(int x1, int y1, int x2, int y2, int[][] g) {
        if(x1 > x2 || y1 > y2) return null;
        if(isLeafNode(g, x1, y1, x2, y2)) {
            return new Node(g[x1][y1] == 1, true, null, null, null, null);
        }
        int midx = (x1 + x2) / 2;
        int midy = (y1 + y2) / 2;
        return new Node(false, false, 
                        helper(x1, y1, midx, midy, g),
                        helper(x1, midy+1, midx, y2, g),
                        helper(midx+1, y1, x2, midy, g),
                        helper(midx+1, midy+1, x2, y2, g));
    }

    private boolean isLeafNode(int[][] g, int x1, int y1, int x2, int y2) {
        boolean isLeaf = true;
        for(int i = x1; i <= x2; ++i) {
            for(int j = y1; j <= y2; ++j) {
                if(g[i][j] != g[x1][y1]) {
                    isLeaf = false;
                    break;
                }
            }
        }
        return isLeaf;
    }
    
}

