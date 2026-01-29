class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int ans=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            count++;
            if(x==0){
               k--; 
               
            }
            if(k < 0) {
                if (nums[left] == 0) {
                    k++;
                }
                left++;
                count--; 
            }
            ans=Math.max(ans,count);

        }
        return ans;
    }
}