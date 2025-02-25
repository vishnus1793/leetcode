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
    public boolean cor(TreeNode a,TreeNode b){
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        return (a.val==b.val && cor(a.left,b.right)&& cor(a.right,b.left));
    }
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right==null) return true;
        if(root == null) return true;
        return cor(root.left, root.right);
    }
}