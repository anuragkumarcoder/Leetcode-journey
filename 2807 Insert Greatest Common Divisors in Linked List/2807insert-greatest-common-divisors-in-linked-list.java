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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            int g=gcd(curr.val,curr.next.val);

            ListNode newnode=new ListNode(g);
            
            newnode.next=curr.next;
            curr.next=newnode;
            curr=newnode.next;
        }
        return head;
        
    }
    static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }   
}