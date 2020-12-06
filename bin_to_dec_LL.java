// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int count = 1;
        int i = 1;
        int ans = 0;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        temp = head;
        int val;
        while(temp != null){
            val = temp.val;
            ans += Math.pow(2, count-i) * val;
            temp = temp.next;
            i++;
        }
        
        return ans;
    }
}
