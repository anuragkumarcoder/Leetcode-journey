class Solution {
    public List<String> validStrings(int n) {
      List<String> list=new ArrayList<>();
      helper(list,n,0,""); 
      return list; 
    }
    void helper(List<String> list,int n,int ind,String st){
        if(n==ind){
            list.add(st);
            return;
        }
        helper(list,n,ind+1,st+"1");
        if(ind==0 || st.charAt(ind-1)=='1'){
            helper(list,n,ind+1,st+"0");
        }
        
        

    }
}