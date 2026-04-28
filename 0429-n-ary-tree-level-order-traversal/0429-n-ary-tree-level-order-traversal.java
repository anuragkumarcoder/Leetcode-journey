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
    public List<List<Integer>> levelOrder(Node root) {
       
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        List<List<Integer>> list=new ArrayList<>();
         if (root == null) {
            return list;
        }
        while(!q.isEmpty()){
            List<Integer> l=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                Node curr =q.poll();
                l.add(curr.val);
                if (curr.children != null) {
                    for (Node node : curr.children) {
                        q.offer(node);
                    }
                }
                  
            }
            list.add(l);
          

        }
        return list;

    }
}