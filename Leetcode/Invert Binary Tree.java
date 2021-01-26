// https://leetcode.com/problems/invert-binary-tree/

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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode tracking_node = q.remove();
            TreeNode temp = tracking_node.left;
            tracking_node.left = tracking_node.right;
            tracking_node.right = temp;
            if(tracking_node.left != null){
                q.add(tracking_node.left);
            }
            if(tracking_node.right != null){
                q.add(tracking_node.right);
            }
        }
        return root;
    }
}
