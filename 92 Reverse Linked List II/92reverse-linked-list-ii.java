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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count=1;
        ListNode prevL=null;
        ListNode  temp=head;
        while(count!=left){
            prevL=temp;
            temp=temp.next;
            count++;
        }
        ListNode prev=null;
        ListNode curr=temp;
        ListNode next=null;
        for(int i=0;i<right-left+1;i++){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        if(prevL!=null){
            prevL.next=prev;
        }
        else{
            head=prev;
        }
        temp.next=curr;
        return head;
    }
}