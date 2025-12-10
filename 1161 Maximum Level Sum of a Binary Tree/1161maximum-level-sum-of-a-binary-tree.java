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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int level=1;
        q.offer(root);
        while(!q.isEmpty()){
            int max=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                max+=temp.val;
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
                
            }
            map.put(level,max);
            level++;
           

        }
        int value=Integer.MIN_VALUE;
        int key=0;
        for(int x : map.keySet()){
            if(map.get(x)>value){
                value=map.get(x);
                key=x;
            }
        }
        return key;

    }
}