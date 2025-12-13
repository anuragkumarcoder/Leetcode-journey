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
    int temp;
    public boolean isUnivalTree(TreeNode root) {
        temp=root.val;
        return inorder(root);
        
    }
    public boolean inorder(TreeNode root){
        if(root==null){
                return true;
        }

        boolean left=inorder(root.left);
        boolean right=inorder(root.right);
        if(root.val==temp && left==true && right==true ){
            return true;
        }
        return false;
    }

}