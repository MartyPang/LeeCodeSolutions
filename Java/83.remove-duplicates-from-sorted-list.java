/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 *
 * algorithms
 * Easy (41.91%)
 * Total Accepted:    304.4K
 * Total Submissions: 725.6K
 * Testcase Example:  '[1,1,2]'
 *
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * Example 1:
 * 
 * 
 * Input: 1->1->2
 * Output: 1->2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 * 
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
    /**
     * Two pointer
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode  slow = head, fast = head;
        while(fast != null) {
            if(fast.val == slow.val) {
                fast = fast.next;
                if(fast == null) {
                    slow.next = fast;
                }
            }
            else {
                slow.next = fast;
                slow = fast;
            }
        }
        return head;
    }
}

