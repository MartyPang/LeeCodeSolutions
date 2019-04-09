/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 *
 * https://leetcode.com/problems/palindrome-linked-list/description/
 *
 * algorithms
 * Easy (35.32%)
 * Total Accepted:    243.9K
 * Total Submissions: 684.7K
 * Testcase Example:  '[1,2]'
 *
 * Given a singly linked list, determine if it is a palindrome.
 * 
 * Example 1:
 * 
 * 
 * Input: 1->2
 * Output: false
 * 
 * Example 2:
 * 
 * 
 * Input: 1->2->2->1
 * Output: true
 * 
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
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
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode p1 = head;
        ListNode p2 = p1.next;
        ListNode p3 = head;
        ListNode pre = p1;
        while(p3.next != null && p3.next.next != null) {
            //two moves
            p3 = p3.next.next;
            //reverse
            pre = p1;
            p1 = p2;
            p2 = p2.next;
            p1.next = pre;
        }

        if(p3.next == null) p1 = p1.next;

        while(p2 != null) {
            if(p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}

