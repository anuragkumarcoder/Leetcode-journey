class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list =new ArrayList<>();
        helper(n,k,1,new ArrayList<>(),list);
        return list;
    }
    public void helper(int n,int k,int start,List<Integer> temp,List<List<Integer>> list){
        if(temp.size()==k){
            list.add(new ArrayList<>(temp));
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            helper(n,k,i+1,temp,list);
            temp.remove(temp.size()-1);
        }
    }
}