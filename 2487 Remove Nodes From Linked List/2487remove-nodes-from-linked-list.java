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
    public ListNode removeNodes(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        int max=0;
        ListNode temp=prev;
        ListNode newhead=null;
        while(temp!=null){
           
            if(temp.val>=max){
                max=temp.val;
                ListNode node=new ListNode(temp.val);
                node.next=newhead;
                newhead=node;
            }
            temp=temp.next;

        }
        return newhead;

    }
}