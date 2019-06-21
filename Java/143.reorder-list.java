/*
 * @lc app=leetcode id=143 lang=java
 *
 * [143] Reorder List
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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head, fast = head;
        while(fast.next != null) {
            fast = fast.next;
            if(fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        
        ListNode first = head, second = slow.next;
        slow.next = null;
        //reverse second half
        second = reverse(second);

        //merge first half and second half
        merge(first, second);

    }

    private ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    private void merge(ListNode first, ListNode second) {
        while(second != null) {
            ListNode tmp = first.next;
            first.next = second;
            first = second;
            second = tmp;
        }
    }
}

