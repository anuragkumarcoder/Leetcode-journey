class Solution {
    public int maximumCandies(int[] candies, long k) {
        long low=1;
        long high=0;
        for(int x : candies) high=Math.max(high,x);
        int ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            long curr=0;
            for(int x : candies){
                curr+=x/mid;
            }
            if(curr>=k){
                ans=(int)mid;
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return ans;
    }
}