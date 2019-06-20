/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null) return head;
        ListNode l1 = head;
        int len = 1;
        while(l1.next != null) {
            ++len;
            l1 = l1.next;
        }
        k %= len;
        if(k == 0) return head;
        ListNode slow = head, fast = head;
        ListNode prev = slow;
        for(int i = 0; i < k; ++i) {
            fast = fast.next;
        }
        while(fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
        l1.next = head;
        return slow;
    }
}

