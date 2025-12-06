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
    public int[] findMode(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        HashMap<Integer,Integer> map=new HashMap<>();
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
        int max=0;
        for(int x : map.keySet()){
            max=Math.max(map.get(x),max);
        }
        List<Integer> resultList = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) == max){
                resultList.add(key);
            }
        }
        int[] arr=new int[resultList.size()];
        for(int i=0;i<resultList.size();i++){
            arr[i]=resultList.get(i);
        }
        return arr;
    }
}