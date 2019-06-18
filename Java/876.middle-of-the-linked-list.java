/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
            if(fast.next == null) break;
            fast = fast.next;
        }
        return slow;
    }
}

