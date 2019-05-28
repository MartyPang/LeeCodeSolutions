import java.util.Stack;
/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        
        int points = 0;
        for(String s : ops) {
            if(s.equals("+")) {
                int last = stack.pop();
                int lastlast = stack.pop();
                points += (last + lastlast);
                stack.push(lastlast);
                stack.push(last);
                stack.push(last+lastlast);
            }
            else if(s.equals("D")) {
                int last = stack.peek();
                points += (last*2);
                stack.push(last*2);
            }
            else if(s.equals("C")) {
                points -= stack.pop();
            }
            else {
                stack.push(Integer.parseInt(s));
                points += stack.peek();
            }
        }
        return points;
    }
}

