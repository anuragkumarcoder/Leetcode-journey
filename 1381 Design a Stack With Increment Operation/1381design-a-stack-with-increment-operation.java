class CustomStack {
    Stack<Integer> st;
    Stack<Integer> new1;
    Stack<Integer> new2;
    int maxSize;
    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
        new1= new Stack<>();
        new2=new Stack<>();
        st=new Stack<>();

    }
    
    public void push(int x) {
        if(st.size()<maxSize) st.push(x);
        
    }
    
    public int pop() {
        if(!st.isEmpty()){
            return st.pop();
        }
        return -1;
        
    }
    
    public void increment(int k, int val) {
        while(st.size()>k){
            new1.push(st.pop());
        }
        while(!st.isEmpty()){
            new2.push(st.pop()+val);
        }
        while(!new2.isEmpty()){
            st.push(new2.pop());
        }
        while(!new1.isEmpty()){
            st.push(new1.pop());
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