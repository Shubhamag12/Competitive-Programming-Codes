// https://leetcode.com/problems/palindrome-linked-list/

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
    public boolean isPalindrome(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        
        while(temp1 != null && temp1.next != null){
            temp2 = temp2.next;
            temp1 = temp1.next.next;
        }
        temp1 = head;
        temp2 = reverse(temp2);
        while(temp2 != null) {
            if(temp2.val != temp1.val){
                return false;
            }
            else {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prevNode = null;
        ListNode nextNode = null;
        while(head != null) {
            nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        } 
        return prevNode;
    }
}
