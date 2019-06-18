import java.util.Stack;

/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */
class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> ss = new Stack<>();
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i < S.length()) {
            if(S.charAt(i) != '#') ss.push(S.charAt(i));
            else {
                if(!ss.isEmpty()) ss.pop();
            }
            ++i;
        }
        i = 0;
        while(i < T.length()) {
            if(T.charAt(i) != '#') st.push(T.charAt(i));
            else {
                if(!st.isEmpty()) st.pop();
            }
            ++i;
        }
        if(ss.size() != st.size()) return false;
        while(!ss.isEmpty() || !st.isEmpty()) {
            if(ss.pop() != st.pop()) return false;
        }
        return true;
    }
}

