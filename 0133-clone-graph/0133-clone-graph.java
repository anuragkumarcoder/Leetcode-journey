/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }

        Node root = new Node(node.val);
        map.put(node, root);

        helper(root, node);
        return root;
    }

    void helper(Node root, Node node){
        for(Node no : node.neighbors){
            if(map.containsKey(no)){
                root.neighbors.add(map.get(no));
            }
            else{
                Node newnode = new Node(no.val);
                map.put(no, newnode);
                root.neighbors.add(newnode);
                helper(newnode, no);
            }
        }
    }
}