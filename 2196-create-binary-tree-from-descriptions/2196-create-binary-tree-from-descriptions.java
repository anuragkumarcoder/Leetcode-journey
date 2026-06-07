/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;;
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
    public TreeNode createBinaryTree(int[][] descriptions) {
        if(descriptions.length==0){
            return null;
        }
        HashMap<Integer,TreeNode> map =new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int[] x : descriptions){
            int p=x[0];
            int q=x[1];
            int r=x[2];
            if(!map.containsKey(p)){
                map.put(p,new TreeNode(p));
            }
            if(!map.containsKey(q)){
                map.put(q,new TreeNode(q));
            }
            TreeNode newnode=map.get(p);
            TreeNode node=map.get(q);
            if(r==0){
                newnode.right=node;
            }else{
                newnode.left=node;
            }
            set.add(node.val);
        }
        for(int x : map.keySet()){
            if(!set.contains(x)){
                return map.get(x);
            }
        }
        return null;
        
    }
}