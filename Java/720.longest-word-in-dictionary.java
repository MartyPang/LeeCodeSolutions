import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
/*
 * @lc app=leetcode id=720 lang=java
 *
 * [720] Longest Word in Dictionary
 */
class Solution {
    class TrieNode {
        public String value;
        public Map<Character, TrieNode> children = new HashMap<>();
        //boolean isEndOfWord = false;
        int endIndex = 0;
    }

    class Trie {
        public TrieNode root = new TrieNode();
        
        public void insert(String word, int index) {
            TrieNode cur = root;
            for(char c : word.toCharArray()) {
                TrieNode next = cur.children.get(c);
                if(next == null) {
                    next = new TrieNode();
                    next.value = c+"";
                    cur.children.put(c, next);
                }
                cur = next;
            }
            cur.endIndex = index;
        }
    }
    public String longestWord(String[] words) {
        Trie tree = new Trie();
        tree.root.endIndex = 0;
        for(int i = 0; i < words.length; ++i) {
            tree.insert(words[i], i+1);
        }
        String res = "";
        //dfs
        Stack<TrieNode> stack = new Stack<>();
        stack.push(tree.root);
        while(!stack.isEmpty()) {
            TrieNode node = stack.pop();
            // check if node represents a word from words
            if(node.endIndex > 0 || node == tree.root) {
                if(node != tree.root) {
                    String word = words[node.endIndex - 1];
                    if(word.length() > res.length() || word.length() == res.length() && word.compareTo(res) < 0) {
                        res = word;
                    }
                }
                for(TrieNode n : node.children.values()) {
                    stack.push(n);
                }
            }
        }
        return res;
    }
}

