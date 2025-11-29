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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();
        q.add(root);
        if(root==null){
            return result;
        }
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int LevelSize=q.size();
            for(int i=0;i<LevelSize;i++){
                TreeNode temp=q.poll();
                list.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            result.add(0,list);
        }
        return result;

    }
}