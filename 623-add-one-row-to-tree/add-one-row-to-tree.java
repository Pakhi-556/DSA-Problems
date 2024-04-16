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
    public TreeNode helper(TreeNode root,int val, int depth,int curr){
        if(root==null){
            return null;
        }

        if(curr==depth-1){
            TreeNode l=root.left;
            TreeNode r=root.right;

            root.left=new TreeNode(val);
            root.right=new TreeNode(val);

            root.left.left=l;
            root.right.right=r;

            return root;
        }

        root.left=helper(root.left,val,depth,curr+1);
        root.right=helper(root.right,val,depth,curr+1);

        return root;
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode curr=new TreeNode(val);
            curr.left=root;
            return curr;
        }

        return helper(root, val, depth,1);
    }

}