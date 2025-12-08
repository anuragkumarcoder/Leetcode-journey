class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int levelSize = q.size(); // 1. Determine how many nodes are in this level
            boolean xx = false;
            boolean yy = false;
            
            // 2. Process ALL nodes at this specific depth
            for(int i = 0; i < levelSize; i++) {
                TreeNode temp = q.poll();
                
                // Check if we found our targets
                if(temp.val == x) xx = true;
                if(temp.val == y) yy = true;
                
                // Check for SIBLINGS (Same parent -> Return false)
                if (temp.left != null && temp.right != null) {
                    if ((temp.left.val == x && temp.right.val == y) || 
                        (temp.left.val == y && temp.right.val == x)) {
                        return false; 
                    }
                }
                
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            if (xx && yy) return true;
            if (xx || yy) return false;
        }
        return false;
    }
}