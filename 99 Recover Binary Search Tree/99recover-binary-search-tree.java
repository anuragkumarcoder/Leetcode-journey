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
    int ind=0;
    public void recoverTree(TreeNode root) {
       List<Integer> list=new ArrayList<>();
       inorder (root,list); 
       Collections.sort(list);
        helper(root,list);
    }
    public void inorder (TreeNode root,List<Integer> list){
        if(root==null){
            return ;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public void helper(TreeNode root,List<Integer> list){
        if(root==null){
            return ;
        }
        helper(root.left,list);
        if(ind<list.size())
            root.val=list.get(ind++);
        helper(root.right,list);
    }

}