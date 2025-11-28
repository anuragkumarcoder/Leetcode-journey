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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> dq=new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        dq.add(root);
        boolean flag=true;
        while(!dq.isEmpty()){
            int levelSize=dq.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                if(flag){
                    TreeNode temp=dq.removeFirst();
                    list.add(temp.val);
                    if(temp.left!=null){
                        dq.addLast(temp.left);
                    }
                    if(temp.right!=null){
                        dq.addLast(temp.right);
                    }

                }
                else{
                       TreeNode temp=dq.removeLast();
                       list.add(temp.val);
                       if(temp.right!=null){
                        dq.addFirst(temp.right);
                    }
                    if(temp.left!=null){
                        dq.addFirst(temp.left);
                    }
                    

                }
            }
            result.add(list);
            flag=!flag;
        }
        return result;
        
    }
}