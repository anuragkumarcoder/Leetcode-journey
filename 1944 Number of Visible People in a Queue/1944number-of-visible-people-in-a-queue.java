class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int h=heights.length;
        int[] ans=new int[h];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<h;i++){
            while(!st.isEmpty()&&heights[i]>heights[st.peek()]){
                ans[st.pop()]++;
            }
            if(!st.isEmpty()){
                ans[st.peek()]++;
            }
            st.push(i);
        }
        return ans;
        
    }
}