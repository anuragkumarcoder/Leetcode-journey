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
    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer>list=new HashSet<>();
        inorder(root,list); 
       List<Integer> l=new ArrayList<>();
       int ind=0;
       for(int k : list ){
            l.add(k);
            ind++;
       }
       Collections.sort(l);
       if(ind>1){
        return l.get(1);
       }
       else{
        return -1;
       }

   }
   public HashSet<Integer> inorder(TreeNode node,HashSet<Integer> list){
    if(node==null){
        return list;
    }
    inorder(node.left,list);
    list.add(node.val);
    inorder(node.right,list);
    return list;
   }
}