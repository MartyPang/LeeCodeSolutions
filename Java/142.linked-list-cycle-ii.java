/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        boolean hasCycle = false;
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
            if(slow != null && fast != null && fast.next != null) {
                fast = fast.next;
                if(slow == fast) {
                    hasCycle = true;
                    break;
                }
            }
            else break;
        }
        if(!hasCycle) return null;
        fast = head;
        while(fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}

