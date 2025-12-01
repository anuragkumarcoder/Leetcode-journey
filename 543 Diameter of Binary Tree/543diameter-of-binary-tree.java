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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int dl=diameterOfBinaryTree(root.left);
        int dr=diameterOfBinaryTree(root.right);
        int cur=Height(root.left)+Height(root.right);
        return Math.max(Math.max(dl,dr),cur);
    }
    public int Height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(Height(root.left),Height(root.right))+1;
    }
}
        
