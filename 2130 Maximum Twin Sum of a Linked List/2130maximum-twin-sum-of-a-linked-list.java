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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        int count=0;
        int ans=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int n=count/2;
        int[] arr=new int[count];
        ListNode curr=head;
        for(int i=0;i<count;i++){
            
            arr[i]=curr.val;
            curr=curr.next;
        }
        for(int i=0;i<n;i++){
            if(arr[i]+arr[count-1-i]>ans){
                ans=arr[i]+arr[count-1-i];
            }

        }
        return ans;
    }
}