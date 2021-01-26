// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        List<Integer> temp_list = new ArrayList<>();
        st1.push(root);
        while(!st1.isEmpty() || !st2.isEmpty()){
            while(!st1.isEmpty()){
                TreeNode temp = st1.pop();
                temp_list.add(temp.val);
                if(temp.left != null){
                    st2.push(temp.left);
                }
                if(temp.right != null){
                    st2.push(temp.right);
                }
            }
            if(!temp_list.isEmpty()){
                ans.add(new ArrayList<>(temp_list));
            }
            temp_list.clear();
            while(!st2.isEmpty()){
                TreeNode temp = st2.pop();
                temp_list.add(temp.val);
                if(temp.right != null){
                    st1.push(temp.right);
                }
                if(temp.left != null){
                    st1.push(temp.left);
                }
            }
            if(!temp_list.isEmpty()){
                ans.add(new ArrayList<>(temp_list));
            }
            temp_list.clear();
        }
        return ans;
    }
}
