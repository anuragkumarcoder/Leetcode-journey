/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        Queue<Node> q=new LinkedList<>();
        if(root==null)
            return 0;
        int ans=0;
        q.offer(root);
        while(!q.isEmpty()){
            int x=q.size();
            for(int i=0;i<x;i++){
                Node curr=q.poll();
                for(Node temp : curr.children){
                    if(temp!=null){
                        q.offer(temp);
                    }
                }
            }
            ans++;    
            
        }
        return ans;
    }
}


















