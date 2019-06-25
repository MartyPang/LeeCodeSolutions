/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 */
class Solution {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        if(board.length == 0 || board[0].length == 0) return false;
        visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[0].length; ++j) {
                if(board[i][j] == word.charAt(0) && backtrack(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, String word, int i, int j, int len) {
        if(len == word.length()) return true;
        if(i < 0 || i > board.length - 1 || j < 0 || j > board[i].length - 1 || board[i][j] != word.charAt(len) || visited[i][j]) return false;
        visited[i][j] = true;
        if(backtrack(board, word, i, j-1, len+1) || 
           backtrack(board, word, i, j+1, len+1) ||
           backtrack(board, word, i-1, j, len+1) ||
           backtrack(board, word, i+1, j, len+1)) {
               return true;
        }
        visited[i][j] = false;
        return false;
    }
}

