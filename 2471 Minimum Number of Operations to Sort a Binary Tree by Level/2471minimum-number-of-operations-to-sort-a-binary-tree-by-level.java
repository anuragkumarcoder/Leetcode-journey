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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int ans=0;
        while(!q.isEmpty()){
            int levelSize=q.size();
            int[] arr=new int[levelSize];
            for(int i=0;i<levelSize;i++){
                TreeNode temp=q.poll();
                arr[i]=temp.val;
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            HashMap<Integer,Integer> map=new HashMap<>();
            int[] temp=arr.clone();
            Arrays.sort(temp);
            for(int i=0;i<temp.length;i++ ){
                map.put(temp[i],i);

            }
            for(int i=0;i<temp.length;i++){
                while(arr[i]!=temp[i]){
                    ans++;
                    int corr=map.get(arr[i]);
                    int tempval=arr[i];
                    arr[i]=arr[corr];
                    arr[corr]=tempval;
                }
            }

        }
        return ans;
    }
}