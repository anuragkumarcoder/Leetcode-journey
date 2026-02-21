class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;

        if(nums.length<4){
            return false;
        }
        int ind=0;
        while(ind+1<n && nums[ind]<nums[ind+1]) ind++;
        if(ind==0 || ind==n-1){
            return false;
        }
        int peak=ind;
        while(ind+1<n && nums[ind]>nums[ind+1]) ind++;
        if(ind==peak || ind==n-1){
            return false;
        }
        int valley=ind;
        while(ind+1<n && nums[ind]<nums[ind+1]) ind++;        
        if(ind==valley){
            return false;
        }
        return ind==n-1;
    }
}