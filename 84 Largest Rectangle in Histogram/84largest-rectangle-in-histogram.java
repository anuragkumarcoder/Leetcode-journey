class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int[] right=new int[n];
        int[] left=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=-1;
            }
            else{
                left[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                right[i]=n;
            }
            else{
                right[i]=st.peek();
            }
            st.push(i);
        }    
        int ans=0;
        for(int i=0;i<n;i++){
            int curr=heights[i]*(right[i]-left[i]-1);
            if(ans<=curr){
                ans=curr;
            }
        }
        return ans;

    }
}
