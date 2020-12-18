// https://leetcode.com/problems/design-a-stack-with-increment-operation/

class CustomStack {
    
    Stack<Integer> st1;
    Stack<Integer> st2;
    int max;
    
    public CustomStack(int maxSize) {
        this.max = maxSize;
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        if(st1.size() != max){
            st1.push(x);
        }
    }
    
    public int pop() {
        if(st1.isEmpty()){
            return(-1);
        }
        else{
            return st1.pop();
        }
    }
    
    public void increment(int k, int val) {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        for(int i = 0; i < k; i++){
            if(!st2.isEmpty()){
                st1.push(st2.pop() + val);
            }
        }
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
