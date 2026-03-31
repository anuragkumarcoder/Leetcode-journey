class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        int curr=0;
        for(int x : nums){
            if(x==0){
                curr++;
                ans+=curr;
            }
            else{
                curr=0;
            }

        }
        return ans;
    }
}