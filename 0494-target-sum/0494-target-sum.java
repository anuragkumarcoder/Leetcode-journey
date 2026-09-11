class Solution {
    public int findTargetSumWays(int[] nums, int target) {
      return  helper(nums,target,0,0);
    }
    int helper(int[] nums, int target,int ind,int curr){
        if(ind==nums.length){
            if(curr==target){
                return 1;
            }
            return 0;
        }
        
        int add=helper(nums,target,ind+1,curr+nums[ind]);
        int sub=helper(nums,target,ind+1,curr-nums[ind]);
        return add+sub;
    }
}