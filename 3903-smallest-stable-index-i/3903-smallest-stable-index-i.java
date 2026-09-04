class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int max=nums[i];
            int min=Integer.MAX_VALUE;
            for(int j=0;j<i;j++){
                max=Math.max(nums[j],max);
            }
            
            for(int kl=i;kl<nums.length;kl++){
                min=Math.min(nums[kl],min);
            }
            if((max-min)<=k){
                return i;
            }

        }
        return -1;
    }
}