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
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=slow.next;
        slow.next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
         ListNode temp1=prev;

        ListNode temp=head;
        while(temp1!=null){
            ListNode t1=temp.next;
            ListNode t2=temp1.next;
            temp.next=temp1;
            temp1.next=t1;
            temp=t1;
            temp1=t2;
        }
        

    }
}