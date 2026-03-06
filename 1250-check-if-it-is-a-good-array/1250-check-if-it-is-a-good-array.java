class Solution {
    public boolean isGoodArray(int[] nums) {
        int ans=nums[0];
        for(int x : nums){
            ans=gcd(x,ans);
            if(ans==1) return true;
        }
        return ans==1;
    }
    private int gcd(int a,int b){
        while(b>0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}