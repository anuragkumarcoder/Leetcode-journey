class MinStack {
    Stack<Integer> st;
    Stack<Integer> gmin;
    public MinStack() {
     st=new Stack<>();
     gmin=new Stack<>();
    }
    
    public void push(int val) {
     st.push(val);
     if(gmin.isEmpty() || gmin.peek()>=val){
        gmin.push(val);
     }
    }
    
    public void pop() {
        if(st.peek().equals(gmin.peek())){
            gmin.pop();
        }
        
        if(!st.isEmpty()){
            st.pop();  
        }
        
     
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
       return gmin.peek();
        

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */