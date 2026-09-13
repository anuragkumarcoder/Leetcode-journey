class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> list=new ArrayList<>();
        helper(list,n,k,0,0,"");
        return list;
    }
    void helper(List<String> list,int n,int k,int curr,int ind,String temp){
        if(ind==n && curr<=k){
            list.add(temp);
            return;
        }
        if(ind==0 || temp.charAt(ind-1)=='0'){
            if(curr+ind<=k)
                helper(list,n,k,curr+ind,ind+1,temp+"1");
        }
        helper(list,n,k,curr,ind+1,temp+"0");
    }
}