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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list=new ArrayList<>();
         List<Integer> temp=new ArrayList<>();
        helper(root,targetSum,list,0,temp);
        return list;
    }
    void helper(TreeNode root,int target,List<List<Integer>> list,int curr, List<Integer> temp){
        if(root==null){
            return;
        }
        curr+=root.val;
        temp.add(root.val);
        if (root.left == null && root.right == null && curr == target) {
            list.add(new ArrayList<>(temp));
        }
        helper(root.left,target,list,curr,temp);
        helper(root.right,target,list,curr,temp);
        temp.remove(temp.size()-1);

    }
}