class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int n=temperatures.length;
        int[] ans=new int[n];
        st.push(0);
        for(int i=0;i<n;i++){
            int a=temperatures[i];
            
            while(!st.isEmpty() && a>temperatures[st.peek()]){
                int prev=st.pop();
                ans[prev]=i-prev;
               
            }
            st.push(i);
            
        }
        return ans;
    }
}