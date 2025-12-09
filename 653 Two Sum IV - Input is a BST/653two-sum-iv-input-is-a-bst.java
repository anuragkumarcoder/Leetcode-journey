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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list=new LinkedList<>();
        helper(root,list);
        int start=0;
        int end=list.size()-1;
        while(start<end){
           if(list.get(start)+list.get(end)==k){
            return true;
           }
           if(list.get(start)+list.get(end)>k){
            end--;
           }
           else{
            start++;
           }
        }
        return false;
        
    }
    public void helper(TreeNode root,List<Integer> list){
        
        if(root==null){
            return;
        }
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
        
    }
}