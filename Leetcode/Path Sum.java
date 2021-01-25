// https://leetcode.com/problems/path-sum/

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
        if(root == null){
            return false;
        }
        TreeNode temp;
        Stack<TreeNode> node = new Stack<>();
        Stack<Integer> sum = new Stack<>();
        node.push(root);
        sum.push(targetSum - root.val);
        while(!node.isEmpty()){
            temp = node.pop();
            int current_sum = sum.pop();
            if(temp.left == null && temp.right == null && current_sum == 0){
                return true;
            }
            if(temp.left != null){
                node.push(temp.left);
                sum.push(current_sum - temp.left.val);
            }
            if(temp.right != null){
                node.push(temp.right);
                sum.push(current_sum - temp.right.val);
            }
        }
        return false;
    }
}
