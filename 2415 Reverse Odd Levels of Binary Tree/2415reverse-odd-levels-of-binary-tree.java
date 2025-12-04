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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
    
        q.offer(root);
        int count=0;
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> list=new LinkedList<>();
            for(int i=0;i<level;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null){
                    q.offer(temp.left);
                    list.add(temp.left.val);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                    list.add(temp.right.val);
                }
            }
            count++;
            if(count%2!=0){
                for(int i=0;i<q.size()/2;i++){
                int temp=list.get(i);
                list.set(i,list.get(q.size()-i-1));
                list.set(q.size()-i-1,temp);
                }
                int index = 0;
                    for (TreeNode node : q) {
                        node.val = list.get(index++);
                    }
            }
            
        }
        return root;
    }
}