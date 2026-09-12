class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        for(char x:s.toCharArray()){
            if(x=='#'){
                if(!st.isEmpty())
                    st.pop();
            }else{
                st.push(x);
            }
        }
        String s1="";
        while(!st.isEmpty()){
            char temp=st.pop();
            s1=s1+temp;
        }
        for(char x:t.toCharArray()){
            if(x=='#'){
                if(!st.isEmpty())
                    st.pop();
            }else{
                st.push(x);
            }
        }
        String s2="";
        while(!st.isEmpty()){
            s2=s2+st.pop();
        }
        return s1.equals(s2);
    }
}