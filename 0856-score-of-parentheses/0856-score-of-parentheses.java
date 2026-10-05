class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(char x : s.toCharArray()){
            int val=0;
            if(x=='(') st.push(0);
            else{
                while(st.peek()!=0){
                    val+=st.pop();
                }
                val=Math.max(1,2*val);
                st.pop();
                st.push(val);
            }

        }
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}