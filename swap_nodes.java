// https://leetcode.com/problems/swap-nodes-in-pairs/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = null;
        if(head == null || head.next == null){
            return head;
        }
        else{
            // System.out.println("Called");
            temp = head.next;
            head.next = temp.next;
            temp.next = head;
            head = temp;
            head.next.next = swapPairs(head.next.next);
            return head;
        }
    }
}
