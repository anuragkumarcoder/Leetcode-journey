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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list =new ArrayList<>();
        inorder(root,list);
        return build(list,0,list.size()-1);
    }
    void inorder(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    TreeNode build(ArrayList<Integer>list,int s,int e){
        if(s>e){
            return null;
        }
        int mid=s+(e-s)/2;
       TreeNode node=new TreeNode(list.get(mid));
        node.left=build(list,s,mid-1);
        node.right=build(list,mid+1,e);
        return node;
    }
}