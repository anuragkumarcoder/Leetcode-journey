class Solution {
    public int maximizeGreatness(int[] nums) {
        int left=0;
        int right=1;
        Arrays.sort(nums);
        int ans=0;
        int n=nums.length;
        while(left<n &&right<n){
            if(nums[left]<nums[right]){
                left++;
                right++;
                ans++;
            }
            else{
                right++;
            }

        }
        return ans;
        
    }
}