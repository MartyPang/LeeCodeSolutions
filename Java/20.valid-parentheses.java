import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (35.91%)
 * Total Accepted:    522.5K
 * Total Submissions: 1.5M
 * Testcase Example:  '"()"'
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * 
 * Note that an empty string is also considered valid.
 * 
 * Example 1:
 * 
 * 
 * Input: "()"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "()[]{}"
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "(]"
 * Output: false
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: "([)]"
 * Output: false
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: "{[]}"
 * Output: true
 * 
 * 
 */
class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        boolean valid = true;
        for(int i=0; i<s.length(); ++i) {
            char brancket = s.charAt(i);
            if(brancket == '(' || brancket == '[' ||brancket == '{') {
                stack.push(brancket);
            }
            else {
                if(stack.isEmpty() || !isMatch(stack.pop(), brancket)) {
                    valid = false;
                    break;
                }
            }
        }
        if(valid) {
            if(!stack.isEmpty()) {
                valid = false;
            }
        }
        return valid;
    }

    public boolean isMatch(char left, char right) {
        if((left == '(' && right ==')') || (left == '[' && right ==']') || (left == '{' && right == '}')) {
            return true;
        }
        return false;
    }
}

