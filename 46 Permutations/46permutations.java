class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums);
        return result;
    }
    public void backtrack(List<List<Integer>> result,List<Integer> temp,int[] nums){
        if(temp.size()==nums.length){
            result.add( new ArrayList<>(temp));
            return;
        }
        for(int x : nums){
            if(temp.contains(x)){
                continue;
            }
            temp.add(x);
            backtrack(result,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}