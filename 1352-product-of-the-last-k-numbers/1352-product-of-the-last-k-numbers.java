class ProductOfNumbers {
    ArrayList<Integer> st;
    public ProductOfNumbers() {
        st=new ArrayList<>();
    }
    
    public void add(int num) {
        st.add(num);
    }
    
    public int getProduct(int k) {
        if(st.size()>=k){
            int ans=1;
            int n=st.size()-1;
            for(int i=n;i>n-k;i--){
                ans*=st.get(i);
                
            }
            return ans;
        }else{
            return -1;
        }
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */