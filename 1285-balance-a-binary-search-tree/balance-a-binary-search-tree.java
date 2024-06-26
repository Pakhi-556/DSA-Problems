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
    public TreeNode balanceBST(TreeNode root) {
        if(root==null){
            return null;
        }

        List<TreeNode> inorderTraversal=new ArrayList();
        inorder(root,inorderTraversal);
        return helper(inorderTraversal,0,inorderTraversal.size()-1);
    }


    public void inorder(TreeNode root, List<TreeNode> ll){
        if(root==null){
            return;
        }

        inorder(root.left,ll);
        ll.add(root);
        inorder(root.right,ll);

    }


    public TreeNode helper(List<TreeNode> ll,int s,int e){
        if(e<s){
            return null;
        }

        int mid= s+(e-s)/2;

        TreeNode root=ll.get(mid);
        root.left=helper(ll,s,mid-1);
        root.right=helper(ll,mid+1,e);

        return root;
    }
}