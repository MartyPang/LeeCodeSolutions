/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
        ListNode h1 = l1, h2 = l2;
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
        int carry = 0;
        int sum;
        while(h1 != null || h2 != null || carry != 0) {
            sum = (h1 == null?0:h1.val) + (h2 == null?0:h2.val) + carry;
            ListNode node = new ListNode(sum%10);
            carry = sum/10;
            cur.next = node;
            cur = node;

            h1 = h1==null?h1:h1.next;
            h2 = h2==null?h2:h2.next;
        }
        return dummyHead.next;
    }
}

