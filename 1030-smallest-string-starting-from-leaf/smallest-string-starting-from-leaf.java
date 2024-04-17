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
    String result="";
    public String smallestFromLeaf(TreeNode root) {
        helper(root, "");
        return result;
        
    }

    private void helper(TreeNode root,String s){
        if(root==null){
            return ;
        }

        s=""+(char)(root.val+'a')+s;

        if(root.left==null && root.right==null){
            if(result.compareTo("")==0){
                result=s;
            }else{
                result=s.compareTo(result)<0 ? s:result;
            }
        }
        
        helper(root.left,s);
        helper(root.right,s);

     }

}