import java.util.*;

/*
 * @lc app=leetcode id=445 lang=java
 *
 * [445] Add Two Numbers II
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        ListNode p1 = l1, p2 = l2;
        while(p1 != null || p2 != null) {
            if(p1 != null) {
                s1.push(p1.val);
                p1 = p1.next;
            }
            if(p2 != null) {
                s2.push(p2.val);
                p2 = p2.next;
            }
        }
        int sum = 0;
        ListNode dummy = new ListNode(0);
        while(!s1.isEmpty() || !s2.isEmpty()) {
            if(!s1.isEmpty()) sum += s1.pop();
            if(!s2.isEmpty()) sum += s2.pop();
            dummy.val = sum%10;
            ListNode head = new ListNode(sum/10);
            head.next = dummy;
            dummy = head;
            sum /= 10;
        }
        return dummy.val == 0 ? dummy.next : dummy;
    }
}

