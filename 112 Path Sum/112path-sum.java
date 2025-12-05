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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Queue<TreeNode> nodes=new LinkedList<>();
        Queue<Integer> sum=new LinkedList<>();
        if(root==null){
            return false;
        }
        nodes.offer(root);
        sum.offer(root.val);
        while(!nodes.isEmpty()){
            TreeNode curr=nodes.poll();
            int currsum=sum.poll();
            if(curr.left==null && curr.right==null && currsum==targetSum){
                return true;
            }
            if(curr.left!=null){
                nodes.offer(curr.left);
                sum.offer(currsum+curr.left.val);
            }
            if(curr.right!=null){
                nodes.offer(curr.right);
                sum.offer(currsum+curr.right.val);
            }
        }
        return false;
    }
}