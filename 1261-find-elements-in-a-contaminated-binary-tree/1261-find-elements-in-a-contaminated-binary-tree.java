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
class FindElements {
    private Queue <TreeNode> q;
    private HashSet<Integer> set;
    public FindElements(TreeNode root) {
        q=new LinkedList<>();
        set=new HashSet<>();
        root.val=0;
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            int x = temp.val;
            set.add(x);
            if(temp.left!=null){
                temp.left.val=x*2 + 1;
                q.offer(temp.left);
            }
            if(temp.right!=null){
                temp.right.val=x*2 + 2;
                q.offer(temp.right);
            }
        }
    }
    
    public boolean find(int target) {
            return set.contains(target);

        
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */