class Solution {
    public int minOperations(int[] nums, int x) {
       int max=-1;
       int left=0;
       int sum=0;
       int target=0;
       int temp=0;
       for(int y : nums) temp+=y;
       if(temp<x) return -1;
       target=temp-x;
       for(int right=0;right<nums.length;right++){
        sum+=nums[right];
        while(sum>target){
            sum-=nums[left++];
        }
        if(sum==target) max=Math.max(max,right-left+1);

       }
       if(max == -1)
            return -1;
       return nums.length-max;
    }
}