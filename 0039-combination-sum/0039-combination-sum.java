class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp =new ArrayList<>();
        helper(candidates,target,temp,0,0,list);
        return list;
        
    }
    public void helper(int[] candidates,int target,List<Integer> temp,int start,int sum,List<List<Integer>> list){
        if(sum==target){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i =start;i<candidates.length;i++){
            temp.add(candidates[i]);
            helper(candidates,target,temp,i,sum+candidates[i],list);
            temp.remove(temp.size() - 1);
        }
    }
}