import java.util.Stack;
/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */
class Solution {
    public class Pair {
        public int x;
        public int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) return image;
        //int[][] visited = new int[image.length][image[0].length];
        Stack<Pair> pairs = new Stack<>();
        pairs.push(new Pair(sr, sc));
        int oldColor = image[sr][sc];
        while(!pairs.isEmpty()) {
            Pair p = pairs.pop();
            // if(p.x - 1 >= 0 && visited[p.x-1][p.y] == 0 && image[p.x-1][p.y] == oldColor) pairs.push(new Pair(p.x-1, p.y));
            // if(p.x+1 <= image.length - 1 && visited[p.x+1][p.y] == 0 && image[p.x+1][p.y] == oldColor) pairs.push(new Pair(p.x+1, p.y));
            // if(p.y - 1 >= 0 && visited[p.x][p.y-1] == 0 && image[p.x][p.y-1] == oldColor) pairs.push(new Pair(p.x,p.y-1));
            // if(p.y + 1 <= image[0].length - 1 && visited[p.x][p.y+1] == 0 && image[p.x][p.y+1] == oldColor) pairs.push(new Pair(p.x,p.y+1));
            if(p.x - 1 >= 0 && image[p.x-1][p.y] == oldColor) pairs.push(new Pair(p.x-1, p.y));
            if(p.x+1 <= image.length - 1 && image[p.x+1][p.y] == oldColor) pairs.push(new Pair(p.x+1, p.y));
            if(p.y - 1 >= 0 && image[p.x][p.y-1] == oldColor) pairs.push(new Pair(p.x,p.y-1));
            if(p.y + 1 <= image[0].length - 1 && image[p.x][p.y+1] == oldColor) pairs.push(new Pair(p.x,p.y+1));
            image[p.x][p.y] = newColor;
        }
        return image;
    }
}

