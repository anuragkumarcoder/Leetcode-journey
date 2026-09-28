class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
       Stack <Character> st=new Stack<>();
       for(char c:s.toCharArray()){
            if(c=='('){
                st.push(c);
                count++;
            }else if(c==')'){
                st.pop();
                if(max<count){
                    max=count;
                }
                count--;
            }
            else{
                st.push(c);
                
                
            }

       } 
       return max;
    }
}