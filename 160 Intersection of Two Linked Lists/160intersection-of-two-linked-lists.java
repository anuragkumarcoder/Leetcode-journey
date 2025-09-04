/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int cntA=0;
        int cntB=0;
        while(tempA!=null || tempB!=null){
            if(tempA!=null){
                tempA=tempA.next;
                cntA++;
            }
            if(tempB!=null){
                tempB=tempB.next;
                cntB++;
            }
        }
        tempA=headA;
        tempB=headB;
        if(cntA>cntB){
            int n=cntA-cntB;
            for(int i=0;i<n;i++){
                tempA=tempA.next;
            }
        }
        else if(cntB>cntA){
            int n=cntB-cntA;
            for(int i=0;i<n;i++){
                tempB=tempB.next;
            }
        }
        
            while(tempA!=tempB){
                
                    tempA=tempA.next;
                    tempB=tempB.next;
                
            }

        
        return tempA;
       
    }
}