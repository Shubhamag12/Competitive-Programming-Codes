// https://leetcode.com/problems/maximum-binary-tree/

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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructTree(nums, 0, nums.length); 
    }
    
    public int findIndexofMaxValue(int[] nums, int start, int end){
        int max_index = start;
        for(int i = start; i < end; i++){
            if(nums[i] > nums[max_index]){
                max_index = i;
            }
        }
        return max_index;
    }
    
    public TreeNode constructTree(int[] nums, int start, int end){
        if(start == end){
            return null;
        }
        int max_index = findIndexofMaxValue(nums, start, end);
        TreeNode temp = new TreeNode(nums[max_index]);
        temp.left = constructTree(nums, start, max_index);
        temp.right = constructTree(nums, max_index + 1, end);
        return temp;
    }
}
