/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode first = head, second = head.next;
        while(first.next != null) {
            curr.next = second;
            first.next = second.next;
            second.next = first;

            first = first.next;
            curr = second.next;
            if(first == null) break;
            second = first.next;
            //if(second == null) break;
        }
        return  dummy.next;

    }
}

