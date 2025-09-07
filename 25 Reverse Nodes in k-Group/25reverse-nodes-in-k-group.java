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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Store nodes in an ArrayList
        List<ListNode> nodes = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            nodes.add(temp);
            temp = temp.next;
        }
        for(int i=0;i+k<=nodes.size();i+=k){
            reverse(nodes,i,i+k-1);
        }
        for(int i=0;i<nodes.size()-1;i++){
            nodes.get(i).next=nodes.get(i+1);
        }
        nodes.get(nodes.size()-1).next=null;
        return nodes.get(0);

    }
    static void reverse(List<ListNode> nodes,int left,int right){
        while(left<right){
            ListNode temp=nodes.get(left);
            nodes.set(left,nodes.get(right));
            nodes.set(right,temp);
            left++;
            right--;
        }
    }
}
