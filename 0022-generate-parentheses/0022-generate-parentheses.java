class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();

        helper(list,n,"",0,0);
        return list;
    }
    void helper(List<String> list,int n,String st,int o,int c){
        if(o==n && o+c==(n*2)){
            list.add(st);
            return;
        }
        if(o<n)
            helper(list,n,st+"(",o+1,c);
        if(o>c)
            helper(list,n,st+")",o,c+1);
        
    }
}