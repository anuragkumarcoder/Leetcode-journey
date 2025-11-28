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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<Double> list=new ArrayList<>();
        queue.offer(root);
        if(root==null){
            return list;
        }
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            double sum=0;
            for(int i=0;i<levelSize;i++){
                TreeNode temp=queue.poll();
                sum+=temp.val;
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
            sum=sum/levelSize;
            list.add(sum);
        }
        return list;
        
    }
}