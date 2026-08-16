class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> temp = new ArrayList<>();
        int sum=0;
        helper(candidates,target,sum,0,temp,list);
        return list;
    }
    public void helper(int[] candidates,int target,int sum,int start,List<Integer> temp,List<List<Integer>> list){
        if(sum>target){
            return;
        }
        if(sum==target){
            list.add(new ArrayList<>(temp));
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            temp.add(candidates[i]);
            helper(candidates,target,sum+candidates[i],i+1,temp,list);
            temp.remove(temp.size()-1);
        }
    }
}