class Solution {
    public long maxAlternatingSum(int[] nums) {
        int i=0;
        for(int x : nums){
            nums[i++]=x*x;
        }
        Arrays.sort(nums);
        int n=nums.length;
        int l=nums.length/2;
        long ans=0;
        for(int j=n-1;j>=l;j--){
            ans+=nums[j];
        }
        for(int j=0;j<l;j++){
            ans-=nums[j];
        }
        return ans;
    }
}