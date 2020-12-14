// https://leetcode.com/problems/asteroid-collision/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        if(asteroids.length < 2){
            return asteroids;
        }
        else{
            for(int x : asteroids){
                if(x > 0){
                    st.push(x);
                }
                else{
                    while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(x)){
                        st.pop();
                    }
                    if(st.isEmpty() || st.peek() < 0){
                        st.push(x);
                    }
                    else if(st.peek() == Math.abs(x)){
                        st.pop();
                    }
                }
            }
        }
        int[] newArr = new int[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            newArr[i] = st.pop();
        }
        return newArr;        
    }
}
