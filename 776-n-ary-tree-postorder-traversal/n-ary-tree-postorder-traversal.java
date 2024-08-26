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
    public List<Integer> postorder(Node root) {
        List<Integer> ll=new ArrayList();

        if(root==null){
            return ll;
        }
        
        dfs(root,ll);

        return ll;
    }

    public void dfs(Node root,List<Integer> res){

        for(Node ch:root.children){ 
            dfs(ch,res);
        }

        res.add(root.val);

    }
}