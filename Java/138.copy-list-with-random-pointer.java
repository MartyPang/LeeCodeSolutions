/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node p = head;
        // 1->2->3
        //1->1->2->2->3->3
        while(p != null) {
            Node cp = new Node(p.val, p.next, null);
            //cp.next = p.next;
            p.next = cp;
            p = cp.next;
        }
        p = head;
        Node newHead = p.next;
        while(p != null) {
            Node tmp = p.next;
            if(p.random != null) {
                tmp.random = p.random.next;
            }
            //p.next = tmp.next;
            p = tmp.next;
            //if(p != null) tmp.next = p.next;

        }
        p = head;
        while(p != null) {
            Node tmp = p.next;
            p.next = tmp.next;
            p = tmp.next;
            if(p != null) tmp.next = p.next;
        }
        return newHead;
    }
}

