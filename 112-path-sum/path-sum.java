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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int s=0;
        return a(root,targetSum,s);
    }
    public boolean a(TreeNode r,int t,int s){
        if(r==null)return false;
        if(r.left==null && r.right==null){
            s+=r.val;
            if(s==t)return true;
        }
        return a(r.left,t,s+r.val) || a(r.right,t,s+r.val);
    }
}