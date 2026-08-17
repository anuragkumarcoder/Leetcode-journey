class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
       List<List<Integer>> list = new ArrayList<>();
       int sum=0;
       List<Integer> temp = new ArrayList<>();
       helper(k,n,1,sum,list,temp);
       return list; 
    }
     public void helper(int k,int n,int start,int sum,List<List<Integer>> list,List<Integer>temp){
        if(temp.size()>k){
            return;
        }
        if(temp.size()==k && sum==n){
            list.add(new ArrayList<>(temp));
        }
        for(int i=start;i<=9;i++){
            temp.add(i);
            helper(k,n,i+1,sum+i,list,temp);
            temp.remove(temp.size()-1);
        }
     }
}