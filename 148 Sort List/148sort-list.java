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
    public ListNode sortList(ListNode head) {
        if(head==null||head==null) return head;
        ArrayList <Integer> list=new ArrayList<>();
        ListNode i=head;
        while( i!=null){
            list.add(i.val);
            i=i.next;
        }
        Collections.sort(list);
        i=head;
        int cnt=0;
        while(i!=null){
            i.val=list.get(cnt);
            i=i.next;
            cnt++;
        }
        return head;
    }
}