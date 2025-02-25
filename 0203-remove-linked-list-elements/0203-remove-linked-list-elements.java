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
    public ListNode removeElements(ListNode head, int val) {
         ListNode result = head;
        if (result == null) {
            return null;
        } else if (result.val == val) {
            return removeElements(result.next, val);
        } else {
            result.next = removeElements(result.next, val);
        }
        return result;
    }
}