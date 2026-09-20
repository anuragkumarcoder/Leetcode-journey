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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
       return  helper(nums,0,nums.length-1);
    }
    TreeNode helper(int[] nums,int i,int l){
        if(i>l){
            return null;
        }
        int max=i;
        
        for(int x=i;x<=l;x++){
            if(nums[x]>nums[max]){
                max=x;
            }
        }
        TreeNode root= new TreeNode(nums[max]);
        root.left=helper(nums,i,max-1);
        root.right=helper(nums,max+1,l);
        return root;

    }
}