class Solution {
       int max=0;
       int count=0;
    public int countMaxOrSubsets(int[] nums) {
        
        ArrayList<Integer> list=new ArrayList<>();
     
        
        helper(0,list,nums);
        return count;
    }
    void helper (int index,List<Integer>list,int[] nums){
        if(index==nums.length){
            int ans=0;
            for(int x:list){
                ans|=x;
            }
            if(max<ans) {
                max=ans;
                count=1;
            }
            else if(max==ans){
                count++;
            }
            return;
        }
        list.add(nums[index]);
        helper(index+1,list,nums);
        list.remove(list.size()-1);
        helper(index+1,list,nums);

    }
}