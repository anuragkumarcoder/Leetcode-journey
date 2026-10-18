class Solution {
    void helper (List<List<Integer>> list,int[] nums,List<Integer> temp){
        if(temp.size()==nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])){
                continue;
            }
            temp.add(nums[i]);
            helper(list,nums,temp);
            temp.remove(temp.size()-1);
            
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(list,nums,temp);
        return list;
    }
}