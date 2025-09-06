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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int count=1;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int[] arr=new int[count];
        temp=head;
        for(int i=1;i<count;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }
        int proxy=arr[k];
        arr[k]=arr[count-k];
        arr[count-k]=proxy;
        temp=head;
        for(int i=1;i<count;i++){
            temp.val=arr[i];
            temp=temp.next;
        }
        return head;
    }
}