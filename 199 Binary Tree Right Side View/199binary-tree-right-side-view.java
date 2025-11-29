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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        q.offer(root);
        if(root==null){
            return list;
        }
        while(!q.isEmpty()){
            int level=q.size();
            for(int i=0;i<level;i++){
                TreeNode temp=q.poll();
                if(i==level-1){
                    list.add(temp.val);
                }
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }

        }
        return list;
    }
}