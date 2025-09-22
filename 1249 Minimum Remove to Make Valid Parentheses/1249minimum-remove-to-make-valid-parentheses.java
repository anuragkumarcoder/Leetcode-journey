class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb=new StringBuilder("");
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(') st.push(i);
            else if(c==')'){
                if(!st.isEmpty()&& s.charAt(st.peek())=='('){
                    st.pop();
                }
                else{
                    st.push(i);
                }
                
            } 
           
        }
        for(int j=s.length()-1;j>=0;j--){
            if(!st.isEmpty()&&st.peek()==j){
                st.pop();
            }
            else{
                sb.append(s.charAt(j));
            }
        }
        return sb.reverse().toString();
    }
}