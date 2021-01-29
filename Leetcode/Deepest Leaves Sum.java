// https://leetcode.com/problems/deepest-leaves-sum/

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
    public int deepestLeavesSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        int h = height(root);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        int sum = 0;
        while(true){
            int size = q.size();
            if(size == 0){
                break;
            }
            while(size > 0){
                TreeNode temp = q.remove();
                if(i == h){
                    sum += temp.val;
                }
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
                size--;
            }
            i++;
        }
        return sum;
    }
    
    public int height(TreeNode root){
        int lst = 0, rst = 0;
        if(root == null){
            return 0;
        }
        lst = height(root.left);
        rst = height(root.right);
        return Math.max(lst, rst) + 1;
    }
}
