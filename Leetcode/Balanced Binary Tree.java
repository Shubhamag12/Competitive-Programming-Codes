// https://leetcode.com/problems/balanced-binary-tree/

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
    public boolean isBalanced(TreeNode root) {
        return !(Depth(root) == -1) ;
    }
    
    public int Depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int lst = Depth(root.left);
        if(lst == -1){
            return -1;
        }
        int rst = Depth(root.right);
        if(rst == -1){
            return -1;
        }        
        if(Math.abs(rst - lst) > 1){
            return -1;
        }
        return Math.max(rst, lst) + 1;
    }
}
