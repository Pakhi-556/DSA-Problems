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
    public static void helper(ArrayList<String> ll,TreeNode root,String s){
        if(root==null){
            return ;

        }
        s+=root.val;
        if(root.left==null && root.right==null){
            ll.add(s);
            s=s.replace(s.charAt(s.length()-1)+"","");

        }

        helper(ll,root.left,s);
        helper(ll,root.right,s);
    }

    int help(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        sum=sum*10+root.val;
        if(root.left==null && root.right==null){
            return sum;
        }
        return help(root.left,sum)+help( root.right,sum);
    }

  
    public int sumNumbers(TreeNode root) {
      /* ArrayList<String> ll=new ArrayList();

       helper(ll,root,"");

       int sum=0;
       for(String l:ll){
           sum+=Integer.parseInt(l);
       }

       return sum;*/

       return help(root,0);

    }
}