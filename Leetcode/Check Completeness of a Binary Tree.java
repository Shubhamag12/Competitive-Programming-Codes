// https://leetcode.com/problems/check-completeness-of-a-binary-tree/

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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = false;
        while(!q.isEmpty()){
            TreeNode temp = q.remove();
            if(temp.left != null){
                if(flag){
                    return false;
                }
                q.add(temp.left);
            }
            else{
                flag = true;
            }
            if(temp.right != null){
                if(flag){
                    return false;
                }
                q.add(temp.right);
            }
            else{
                flag = true;
            }
        }
        return true;
    }    
}
