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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans=new int[m][n];
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        ListNode temp=head;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=-1;
            }
        }
        while(left<=right && bottom>=top){
            for(int i=left;i<=right;i++){
                if(temp!=null){
                ans[top][i]=temp.val;
                temp=temp.next;
                }
            }
            top++;
            for(int i=top;i<=bottom;i++){
                if(temp!=null){
                    ans[i][right]=temp.val;
                    temp=temp.next;
                }
            }
            right--;
            for(int i=right;i>=left;i--){
                if(temp!=null){
                    ans[bottom][i]=temp.val;
                    temp=temp.next;
                }
              
            }
            bottom--;
             for(int i=bottom;i>=top;i--){
                if(temp!=null){
                    ans[i][left]=temp.val;
                    temp=temp.next;
                }
                
            }
            left++;

            
        }
        return ans;
    }
}