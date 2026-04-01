class Solution {
    public long getDescentPeriods(int[] prices) {
        int curr=prices[0];
        int n=prices.length;
        long ans=n;
        int latest=1;
        if (n == 0) return 0;
        for(int i=1;i<n;i++){
            if(curr-1==prices[i]){
                ans+=latest++;
            }
            else{
                latest=1;
            }
            curr=prices[i];
        }
        return ans;
    }
}