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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first = -1, prevc = -1;
        int minDist = Integer.MAX_VALUE;
        int index = 1;
        
        ListNode prev = head;
        ListNode curr = head.next;
        
        while (curr != null && curr.next != null) {
            int val = curr.val;
            if ((val > prev.val && val > curr.next.val) || (val < prev.val && val < curr.next.val)) {
                if (first == -1) {
                    first = index;
                } else {
                    minDist = Math.min(minDist, index - prevc);
                }
                prevc = index;
            }
            prev = curr;
            curr = curr.next;
            index++;
        }
        
        if (first == -1 || prevc == first) {
            return new int[]{-1, -1};
        }
        
        return new int[]{minDist, prevc - first};
    }
}
