/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int ans=0;
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.val%2==0){
                if(curr.left!=null){
                    if(curr.left.left!=null)
                        ans+=curr.left.left.val;
                    if(curr.left.right!=null)
                        ans+=curr.left.right.val;
                }
                if(curr.right!=null){
                    if(curr.right.right!=null)
                        ans+=curr.right.right.val;
                    if(curr.right.left!=null)
                        ans+=curr.right.left.val;
                }
            }
            if(curr.left!=null){
                q.offer(curr.left);
            }
            if(curr.right!=null){
                q.offer(curr.right);
            }
        }
        return ans;
    }
}