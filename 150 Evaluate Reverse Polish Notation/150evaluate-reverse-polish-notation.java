class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int a=st.pop();
                int b=st.pop();
                int res=0;
                if(tokens[i].equals("+"))  res=a+b;
                 if(tokens[i].equals("-"))  res=b-a;
                  if(tokens[i].equals("*"))  res=a*b;
                   if(tokens[i].equals("/"))  res=b/a;
                   st.push(res);
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }

            
        }
        return st.pop();
    }
}