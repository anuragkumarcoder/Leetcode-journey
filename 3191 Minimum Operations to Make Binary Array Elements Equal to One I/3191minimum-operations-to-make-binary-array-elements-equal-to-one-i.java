class Solution {
    public int minOperations(int[] nums) {
      
        int ans=0;
        for(int i=0;i+2<nums.length;i++){
            if(nums[i]==0){
                nums[i]^=1;
                nums[i+1]^=1;
                nums[i+2]^=1;
                ans++;
            }
            
        }
        if(nums[nums.length-1]==0||nums[nums.length-2]==0){
            return -1;
        }
        else{
            return ans;
        }
    }
}