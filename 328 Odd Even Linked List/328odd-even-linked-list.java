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
    public ListNode oddEvenList(ListNode head) {
        int count=0;
        ListNode odd=new ListNode(0);
        ListNode t1=odd;
        ListNode even=new ListNode(0);
        ListNode t2=even;
        ListNode temp=head;
        while(temp!=null){
            if(count%2==1){
                ListNode a=new ListNode(temp.val);
                t2.next=a;
                t2=a;
            }
            else{
                ListNode a=new ListNode(temp.val);
                t1.next=a;
                t1=a;
            }
            temp=temp.next;
            count++;
        }
        t1.next=even.next;
        return odd.next;

    }
}