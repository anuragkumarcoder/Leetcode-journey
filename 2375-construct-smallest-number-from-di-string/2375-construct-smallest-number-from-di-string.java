class Solution {
    public String smallestNumber(String pattern) {
      StringBuilder ans=new StringBuilder();
      Stack<Integer> st=new Stack<>();
      for(int i=0;i<=pattern.length();i++){
        st.push(1+i);
        if(i==pattern.length()||pattern.charAt(i)=='I'){
            while(!st.isEmpty()){
                ans.append(st.pop());
            }
        }
      } 
      return ans.toString(); 
    }
}