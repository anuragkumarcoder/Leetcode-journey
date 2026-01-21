class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean flag=false;
        int n=nums.length-1;
        int l=0;
        int r=1;
        for(int i=0;i<n;i++){
            if(nums[l]>nums[r]){
                if(flag){
                   return false;
                }
                   
                flag=true;
                if(i==0 || nums[l-1]<=nums[r]){
                    nums[l]=nums[r];
                }
                else{
                    nums[r]=nums[l];
                }
                
            }
            l++;
            r++;

        }
        return true;
    }
}