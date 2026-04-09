/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> orig=new LinkedList<>();
        Queue<TreeNode> clon=new LinkedList<>();
        orig.offer(original);
        clon.offer(cloned);
        while(!orig.isEmpty()){
            TreeNode currc=clon.poll();
            TreeNode curro=orig.poll();
            if(curro==target){
                return currc;
            }          
            if(currc.left!=null){
                clon.offer(currc.left);
                orig.offer(curro.left);
            }
            if(curro.right!=null){
                orig.offer(curro.right);
                clon.offer(currc.right);
            }
        }
        return null;
    }
}