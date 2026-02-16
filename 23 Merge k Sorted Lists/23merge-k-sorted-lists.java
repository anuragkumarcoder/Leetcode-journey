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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode curr=lists[i];
            while(curr!=null){
                list.add(curr.val);
                curr=curr.next;
            
            }
        }
        Collections.sort(list);
        if(list.isEmpty()){
            return null;
        }
        ListNode head=new ListNode(0);
        ListNode temp=null;
        for(int x : list){
            if(temp==null){
                head.val=x;
                 head.next=null;
                temp=head;
            }
            else{
                ListNode newnode=new ListNode(x);
                temp.next=newnode;
                temp=newnode;
            }
        }
        return head;
    }
}