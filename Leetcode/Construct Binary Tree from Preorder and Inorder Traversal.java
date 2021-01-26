// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int start = 0, end = inorder.length - 1;
        return buildTreeFromTraversal(preorder, inorder, start, end, 0);
    }
    
    public TreeNode buildTreeFromTraversal(int[] preorder, int[] inorder, int start, int end, int preIndex) {
        if(start > end){
            return null;
        }
        int inIndex = start;
        TreeNode temp = new TreeNode(preorder[preIndex]);
        while(preorder[preIndex] != inorder[inIndex]){
            inIndex++;
        }
        
        temp.left = buildTreeFromTraversal(preorder, inorder, start, inIndex - 1, preIndex + 1);
        temp.right = buildTreeFromTraversal(preorder, inorder, inIndex + 1, end, inIndex + preIndex - start + 1);
        return temp;
    }
}
