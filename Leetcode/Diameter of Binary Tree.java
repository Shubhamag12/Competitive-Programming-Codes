// https://leetcode.com/problems/diameter-of-binary-tree/

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
    public int diameterOfBinaryTree(TreeNode root) {
        int rd = 0, ld = 0, lst = 0, rst = 0;
        if(root == null){
            return 0;
        }
        lst = height(root.left);
        rst = height(root.right);
        ld = diameterOfBinaryTree(root.left);
        rd = diameterOfBinaryTree(root.right);
        return Math.max(lst + rst, Math.max(ld, rd));
    }
    
    public int height(TreeNode root){
        int lst = 0, rst = 0;
        if(root == null){
            return 0;
        }
        else{
            lst = height(root.left);
            rst = height(root.right);
            return Math.max(rst, lst) + 1;
        }
    }
}
