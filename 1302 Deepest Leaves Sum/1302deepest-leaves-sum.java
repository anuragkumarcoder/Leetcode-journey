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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> list=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            list.clear();
            int level=q.size();
            for(int i=0;i<level;i++){
                TreeNode node=q.poll();
                int k=node.val;
                q.offer(node);
                list.add(k);
            }
            for(int i=0;i<level;i++){
               TreeNode neww = q.poll();
               if(neww.left!=null){
                q.offer(neww.left);
               }
               if(neww.right!=null){
                q.offer(neww.right);
               }

            }

        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;

    }
}