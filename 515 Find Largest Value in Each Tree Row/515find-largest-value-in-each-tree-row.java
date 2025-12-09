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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        List<Integer> list=new LinkedList<>();
        if(root==null){
            return list;
        }
        while(!q.isEmpty()){
            int level=q.size();
            int[] arr=new int[level];
            for(int i=0;i<level;i++){
                TreeNode temp=q.poll();
                arr[i]=temp.val;
                if(temp.left!=null){
                    q.offer(temp.left); 
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            Arrays.sort(arr);
            list.add(arr[level-1]);
        }
        return list;
    }
}