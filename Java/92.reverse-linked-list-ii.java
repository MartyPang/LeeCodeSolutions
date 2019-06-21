/*
 * @lc app=leetcode id=92 lang=java
 *
 * [92] Reverse Linked List II
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == 1) {
            return nreverse(head, n);
        }
        head.next = reverseBetween(head.next, m-1, n-1);
        return head;
    }

    ListNode successor = null;
    private ListNode nreverse(ListNode head, int n) {
        if(n == 1) {
            successor = head.next;
            return head;
        }
        ListNode newHead = nreverse(head.next, n-1);
        head.next.next = head;
        head.next = successor;
        return newHead;
    }
}

