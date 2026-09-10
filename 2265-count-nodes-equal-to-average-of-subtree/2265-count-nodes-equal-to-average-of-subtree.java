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
    int ans=0;
    int sum=0;
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        
        helper(root);
        return ans;
    }
    void helper(TreeNode root){
        if(root==null){
            return;
        }
        sum=0;
        count=0;
          
        calc(root,0,root.val,0);
        if (sum / count == root.val) {
            ans++;
        }
        helper(root.left);
        helper(root.right);

    }
    void calc(TreeNode root,int avg,int val,int index){
        if(root==null){
            
            return;
        }
        sum+=root.val;
        count++;
        calc(root.left,avg,val,index);
        calc(root.right,avg,val,index);
        
        
    }
}