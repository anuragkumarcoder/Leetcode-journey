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
    public int[] nextLargerNodes(ListNode head) {
       ArrayList<Integer> list=new ArrayList<>();
       ListNode temp=head;
       
       while(temp!=null){
        int next=0;
        ListNode curr=temp.next;
        while(curr!=null){
            if(curr.val>temp.val){
                next=curr.val;
                break;
            }
            else{
                curr=curr.next;
            }
        }
        
        list.add(next);
        temp=temp.next;
       }
       int[] ans=new int[list.size()];
    for(int i=0;i<list.size();i++){
        ans[i]=list.get(i);
    }
    return ans;
    }
}