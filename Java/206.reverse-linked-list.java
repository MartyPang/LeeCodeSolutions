/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 *
 * https://leetcode.com/problems/reverse-linked-list/description/
 *
 * algorithms
 * Easy (52.78%)
 * Total Accepted:    549K
 * Total Submissions: 1M
 * Testcase Example:  '[1,2,3,4,5]'
 *
 * Reverse a singly linked list.
 * 
 * Example:
 * 
 * 
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * 
 * 
 * Follow up:
 * 
 * A linked list can be reversed either iteratively or recursively. Could you
 * implement both?
 * 
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
    // public ListNode reverseList(ListNode head) {
    //     ListNode newHead = null;
    //     ListNode p = null;
    //     ListNode q = head;
    //     while(q != null) {
    //         ListNode next = q.next;
    //         if(next == null) newHead = q;
    //         q.next = p;
    //         p = q;
    //         q = next;
    //     }
    //     return newHead;
    // }

    /**
     * Dummy Node
     */
    // public ListNode reverseList(ListNode head) {
    //     if(head == null) return head;
    //     ListNode dummy = new ListNode(-1);
    //     dummy.next = head;
    //     ListNode p = head;
    //     ListNode q = head.next;
    //     while(q != null) {
    //         p.next = q.next;
    //         q.next = dummy.next;
    //         dummy.next = q;
    //         q = p.next;
    //     }
    //     return dummy.next;
    // }

    /**
     * Reursive
     */
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

