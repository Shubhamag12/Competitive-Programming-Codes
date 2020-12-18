// https://leetcode.com/problems/next-greater-element-i/

class Solution {
    int x;
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(Integer x : nums2){
            while(!st.isEmpty() && st.peek() < x){
                hm.put(st.pop(), x);
            }
            st.push(x);
        }
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = hm.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
