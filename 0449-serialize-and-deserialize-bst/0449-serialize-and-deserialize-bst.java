/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder sb=new StringBuilder();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null) sb.append("# ");
            else{
                sb.append(curr.val).append(" ");
                q.offer(curr.left);
                q.offer(curr.right);
            }
        }
        return sb.toString().trim();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;
        String[] values=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> q=new LinkedList<>();
        int n=values.length;
        q.offer(root);
        for(int i=1;i<n;i++){
            TreeNode curr=q.poll();
            if(!values[i].equals("#"))
            {
                TreeNode left=new TreeNode(Integer.parseInt(values[i]));
                curr.left=left;
                q.offer(left);
            }
            if(++i<n && !values[i].equals("#")){
                TreeNode right=new TreeNode(Integer.parseInt(values[i]));
                curr.right=right;
                q.offer(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;