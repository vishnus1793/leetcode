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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        f(root,r);
        return r;
    }
    public void f(TreeNode root,List<Integer> r){
        if(root!=null){
            f(root.left,r);
            f(root.right,r);
            r.add(root.val);
        }
    }
}