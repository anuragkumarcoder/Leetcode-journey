class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<nums.length;j++){
                min=Math.min(min,nums[j]);
            }
            for(int l=0;l<nums.length;l++){
                if(nums[l]==min){
                   nums[l]=nums[l]*multiplier;
                   break;
                }
                else{
                    continue;
                }
            }
        }
        return nums;
    }
}