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
    public List<List<Integer>> levelOrder(TreeNode root) {

        /* List<List<Integer>> ans=new ArrayList<>();
        compute(ans,root,0);
        return ans;*/


        List<List<Integer>> ll=new ArrayList();
        Queue<TreeNode> q=new LinkedList();

        if(root==null){
            return ll;
        }

        q.add(root);

        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> l=new ArrayList();

            for(int i=0;i<s;i++){
                TreeNode curr=q.remove();
                l.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    q.add(curr.right);
                }
            }

            ll.add(l);
        }


        return ll;

    }
    
    /*public void compute(List<List<Integer>> ans,TreeNode curr,int level)
    {
        if(curr==null) return;
        
        if(ans.size()==level) 
            ans.add(new ArrayList<Integer>());
        
        ans.get(level).add(curr.val);
        
        compute(ans,curr.left,level+1);
        compute(ans,curr.right,level+1);
    }*/

    
}
