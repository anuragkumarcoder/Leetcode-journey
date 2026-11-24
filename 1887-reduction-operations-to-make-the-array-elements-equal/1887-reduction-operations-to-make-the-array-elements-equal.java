class Solution {
    public int reductionOperations(int[] nums) {
      Arrays.sort(nums);
      int ans=0;
      int steps=0;
      for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]) steps++;
        ans+=steps;
      }  
      return ans;
    }
}