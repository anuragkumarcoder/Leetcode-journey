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
    public ListNode rotateRight(ListNode head, int k) {
    ListNode fast=head;
    int cnt=0;
    while(fast!=null){
        fast=fast.next;
        cnt++;
    }
    if(head==null|| head.next==null||k==0){
        return head;
    }
    k=k%cnt;
    if(k==0){
        return head;
    }
     ListNode temp=head;
    for(int i=0;i<cnt-k-1;i++){
        temp=temp.next;
    } 
    ListNode nhead=temp.next;
    temp.next=null;
    ListNode ntail=nhead;
    while(ntail.next!=null){
        ntail=ntail.next;
    }       

    ntail.next=head;
    return nhead; 
    
    }
}