class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> list=new ArrayList<>();
        int[] ans=new int[queries.length];
        for(int i=1;i<=m;i++){
            list.add(i);
        }
        for(int i=0;i<queries.length;i++){
           int val=queries[i];
           int idx=list.indexOf(val);
           ans[i]=idx;
           list.remove(idx);
            list.add(0,val);
        }
        
        
        return ans;
    }
}